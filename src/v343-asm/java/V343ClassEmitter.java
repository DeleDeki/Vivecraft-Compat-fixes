import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.lang.reflect.Method;
import java.util.List;

/** Java-source implementation of the custom-v3.4.3 class-bytecode reconstruction step. */
public final class V343ClassEmitter {
  public static void main(String[] args) throws Exception {
    if (args.length != 2) throw new IllegalArgumentException("Usage: V343ClassEmitter class-list destination-dir");
    Path manifest = Path.of(args[0]);
    Path dest = Path.of(args[1]);
    List<String> classes = Files.readAllLines(manifest, StandardCharsets.UTF_8);
    int emitted = 0;
    for (String path : classes) {
      path = path.trim();
      if (path.isEmpty() || path.startsWith("#")) continue;
      String generatorName = "asm." + path.replace('/', '.') + "Dump";
      Class<?> generator = Class.forName(generatorName);
      Method dump = generator.getMethod("dump");
      byte[] bytes = (byte[]) dump.invoke(null);
      Path output = dest.resolve(path + ".class");
      Files.createDirectories(output.getParent());
      Files.write(output, bytes);
      ++emitted;
    }
    System.out.println("Generated " + emitted + " v3.4.3 class files from Java source.");
  }
}
