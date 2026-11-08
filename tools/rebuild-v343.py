#!/usr/bin/env python3
"""Reassemble the user-tested v3.4.3 from exact 1.6.0 base + patch-kit ZIP.

Binary patch reconstruction, NOT a complete Java source compilation.
Requires Python 3.9+. Checks every JAR member's SHA-256.
"""
from __future__ import annotations
import argparse
import hashlib
import json
from pathlib import Path
from zipfile import ZipFile, ZIP_DEFLATED

def digest(data: bytes) -> str:
    return hashlib.sha256(data).hexdigest()

def main() -> None:
    ap = argparse.ArgumentParser()
    ap.add_argument("base", type=Path, help="Exact unofficial 1.6.0 jar (matching patch manifest SHA)")
    ap.add_argument("patch_kit", type=Path, help="vivecraftcompat-v3.4.3-source-and-rebuild.zip")
    ap.add_argument("--output", type=Path, default=Path("build/libs/vivecraftcompat-fixed-v3.4.3.jar"))
    args = ap.parse_args()
    with ZipFile(args.patch_kit) as kit, ZipFile(args.base) as base:
        mf = json.loads(kit.read("patch-manifest.json"))
        if digest(args.base.read_bytes()) != mf["input_sha256"]:
            raise SystemExit("Wrong input JAR: expected SHA256 " + mf["input_sha256"])
        changed = {name: kit.read(path) for name, path in mf["replaced_or_added"].items()}
        deleted = set(mf.get("deleted", []))
        args.output.parent.mkdir(parents=True, exist_ok=True)
        with ZipFile(args.output, "w", compression=ZIP_DEFLATED, compresslevel=9) as result:
            seen = set()
            for item in base.infolist():
                if item.is_dir() or item.filename in deleted:
                    continue
                result.writestr(item.filename, changed.get(item.filename, base.read(item.filename)))
                seen.add(item.filename)
            for name, value in changed.items():
                if name not in seen:
                    result.writestr(name, value)
    with ZipFile(args.output) as result:
        if result.testzip() is not None:
            raise SystemExit("Output JAR integrity error")
        actual = {n: digest(result.read(n)) for n in result.namelist() if not n.endswith("/")}
        if actual != mf["expected_entries"]:
            mismatch = sorted(k for k in actual.keys() | mf["expected_entries"].keys()
                              if actual.get(k) != mf["expected_entries"].get(k))
            raise SystemExit(f"Output differs from tested version: {mismatch}")
    print(f"VERIFIED: {len(actual)} entries match working v3.4.3, class-for-class")
    print(f"Output: {args.output}")
    print("Jar container checksum may differ because ZIP metadata can change.")

if __name__ == "__main__":
    main()
