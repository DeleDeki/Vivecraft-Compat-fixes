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
public class TypewriterKeyMappingGuardDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(65, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/tom/vivecraftcompat/simulated/TypewriterKeyMappingGuard", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "shouldBlock", "(Lcom/mojang/blaze3d/platform/InputConstants$Key;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/VRMode", "isVR", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge", "isTypewriterModeActive", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/minecraft/client/Minecraft", "getInstance", "()Lnet/minecraft/client/Minecraft;", false);
methodVisitor.visitFieldInsn(GETFIELD, "net/minecraft/client/Minecraft", "screen", "Lnet/minecraft/client/gui/screens/Screen;");
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/mojang/blaze3d/platform/InputConstants$Key", "getType", "()Lcom/mojang/blaze3d/platform/InputConstants$Type;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "com/mojang/blaze3d/platform/InputConstants$Type", "MOUSE", "Lcom/mojang/blaze3d/platform/InputConstants$Type;");
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/mojang/blaze3d/platform/InputConstants$Key", "getValue", "()I", false);
methodVisitor.visitJumpInsn(IFLT, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/vivecraft/client/VivecraftVRMod", "INSTANCE", "Lorg/vivecraft/client/VivecraftVRMod;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/vivecraft/client/VivecraftVRMod", "INSTANCE", "Lorg/vivecraft/client/VivecraftVRMod;");
methodVisitor.visitFieldInsn(GETFIELD, "org/vivecraft/client/VivecraftVRMod", "keyMenuButton", "Lnet/minecraft/client/KeyMapping;");
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/vivecraft/client/VivecraftVRMod", "INSTANCE", "Lorg/vivecraft/client/VivecraftVRMod;");
methodVisitor.visitFieldInsn(GETFIELD, "org/vivecraft/client/VivecraftVRMod", "keyMenuButton", "Lnet/minecraft/client/KeyMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/client/KeyMapping", "getKey", "()Lcom/mojang/blaze3d/platform/InputConstants$Key;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
