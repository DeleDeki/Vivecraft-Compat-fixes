// Generated reconstruction of the v3.4.3 class file using Java 21 ASMifier.
// This is low-level Java ASM source, NOT the original authored source.
// Part of a verified JVM bytecode preservation layer.
package asm.com.tom.vivecraftcompat.simulated;
import jdk.internal.org.objectweb.asm.AnnotationVisitor;
import jdk.internal.org.objectweb.asm.Attribute;
import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.ConstantDynamic;
import jdk.internal.org.objectweb.asm.FieldVisitor;
import jdk.internal.org.objectweb.asm.Handle;
import jdk.internal.org.objectweb.asm.Label;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;
import jdk.internal.org.objectweb.asm.RecordComponentVisitor;
import jdk.internal.org.objectweb.asm.Type;
import jdk.internal.org.objectweb.asm.TypePath;
public class SimulatedVRInputBridge$InputKindDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(65, ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind", "Ljava/lang/Enum<Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;>;", "java/lang/Enum", null);

classWriter.visitSource("SimulatedVRInputBridge.java", null);

classWriter.visitNestHost("com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge");

classWriter.visitInnerClass("com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind", "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge", "InputKind", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USE", "Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ATTACK", "Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(1029, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind", "$VALUES", "[Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;", null, null);
methodVisitor.visitParameter(null, ACC_MANDATED);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(1029, label0);
methodVisitor.visitLdcInsn(Type.getType("Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind");
methodVisitor.visitInsn(ARETURN);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLocalVariable("name", "Ljava/lang/String;", null, label0, label1, 0);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitParameter(null, ACC_SYNTHETIC);
methodVisitor.visitParameter(null, ACC_SYNTHETIC);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(1029, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;", null, label0, label1, 0);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "$values", "()[Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(1029, label0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind", "USE", "Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind", "ATTACK", "Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(1030, label0);
methodVisitor.visitTypeInsn(NEW, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind", "USE", "Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;");
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(1031, label1);
methodVisitor.visitTypeInsn(NEW, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ATTACK");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind", "ATTACK", "Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;");
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(1029, label2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind", "$values", "()[Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind", "$VALUES", "[Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
