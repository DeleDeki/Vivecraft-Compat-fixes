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
public class SimulatedVRInputBridge$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(65, ACC_SUPER, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$1", null, "java/lang/Object", new String[] { "org/vivecraft/client_vr/provider/openvr_lwjgl/VRInputAction$KeyListener" });

classWriter.visitSource("SimulatedVRInputBridge.java", null);

classWriter.visitNestHost("com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge");

classWriter.visitOuterClass("com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge", "registerListener", "(Lnet/minecraft/client/KeyMapping;Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;)V");

classWriter.visitInnerClass("com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$1", null, null, 0);

classWriter.visitInnerClass("com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind", "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge", "InputKind", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/vivecraft/client_vr/provider/openvr_lwjgl/VRInputAction$KeyListener", "org/vivecraft/client_vr/provider/openvr_lwjgl/VRInputAction", "KeyListener", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$inputKind", "Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;)V", "()V", null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(138, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$1", "val$inputKind", "Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$1;", null, label0, label1, 0);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onUnpressed", "(Lorg/vivecraft/client_vr/provider/ControllerType;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(141, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$1", "val$inputKind", "Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind", "ATTACK", "Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(142, label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge", "attackButtonHeld", "Z");
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(143, label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$1", "val$inputKind", "Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge", "fireButton", "(Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;I)Z", false);
methodVisitor.visitInsn(IRETURN);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$1;", null, label0, label3, 0);
methodVisitor.visitLocalVariable("controller", "Lorg/vivecraft/client_vr/provider/ControllerType;", null, label0, label3, 1);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onPressed", "(Lorg/vivecraft/client_vr/provider/ControllerType;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(148, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$1", "val$inputKind", "Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind", "ATTACK", "Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(149, label2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge", "attackButtonHeld", "Z");
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(150, label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$1", "val$inputKind", "Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge", "fireButton", "(Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$InputKind;I)Z", false);
methodVisitor.visitInsn(IRETURN);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$1;", null, label0, label3, 0);
methodVisitor.visitLocalVariable("controller", "Lorg/vivecraft/client_vr/provider/ControllerType;", null, label0, label3, 1);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPriority", "()I", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(155, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/simulated/SimulatedVRInputBridge$1;", null, label0, label1, 0);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
