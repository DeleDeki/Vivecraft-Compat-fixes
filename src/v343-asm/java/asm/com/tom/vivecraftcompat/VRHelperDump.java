// Generated reconstruction of the v3.4.3 class file using Java 21 ASMifier.
// This is low-level Java ASM source, NOT the original authored source.
// Part of a verified JVM bytecode preservation layer.
package asm.com.tom.vivecraftcompat;
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
public class VRHelperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(65, ACC_PUBLIC | ACC_SUPER, "com/tom/vivecraftcompat/VRHelper", null, "java/lang/Object", null);

classWriter.visitSource("VRHelper.java", null);

classWriter.visitInnerClass("org/vivecraft/client_vr/VRData$VRDevicePose", "org/vivecraft/client_vr/VRData", "VRDevicePose", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DATA_HOLDER", "Lorg/vivecraft/client_vr/ClientDataHolderVR;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(8, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/VRHelper;", null, label0, label1, 0);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isVRPlayerInitialized", "()Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(12, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/tom/vivecraftcompat/VRHelper", "DATA_HOLDER", "Lorg/vivecraft/client_vr/ClientDataHolderVR;");
methodVisitor.visitFieldInsn(GETFIELD, "org/vivecraft/client_vr/ClientDataHolderVR", "vrPlayer", "Lorg/vivecraft/client_vr/gameplay/VRPlayer;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/tom/vivecraftcompat/VRHelper", "DATA_HOLDER", "Lorg/vivecraft/client_vr/ClientDataHolderVR;");
methodVisitor.visitFieldInsn(GETFIELD, "org/vivecraft/client_vr/ClientDataHolderVR", "vrPlayer", "Lorg/vivecraft/client_vr/gameplay/VRPlayer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/vivecraft/client_vr/gameplay/VRPlayer", "vrdata_world_render", "Lorg/vivecraft/client_vr/VRData;");
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isStanding", "()Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(16, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/tom/vivecraftcompat/VRHelper", "DATA_HOLDER", "Lorg/vivecraft/client_vr/ClientDataHolderVR;");
methodVisitor.visitFieldInsn(GETFIELD, "org/vivecraft/client_vr/ClientDataHolderVR", "vrSettings", "Lorg/vivecraft/client_vr/settings/VRSettings;");
methodVisitor.visitFieldInsn(GETFIELD, "org/vivecraft/client_vr/settings/VRSettings", "seated", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getRayOrigin", "()Lnet/minecraft/world/phys/Vec3;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(20, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/VRHelper", "getControllerRayOrigin", "(I)Lnet/minecraft/world/phys/Vec3;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getRayDirection", "()Lorg/joml/Vector3f;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(24, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/VRHelper", "getControllerRayDirection", "(I)Lorg/joml/Vector3f;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getControllerRayOrigin", "(I)Lnet/minecraft/world/phys/Vec3;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(28, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/tom/vivecraftcompat/VRHelper", "DATA_HOLDER", "Lorg/vivecraft/client_vr/ClientDataHolderVR;");
methodVisitor.visitFieldInsn(GETFIELD, "org/vivecraft/client_vr/ClientDataHolderVR", "vrPlayer", "Lorg/vivecraft/client_vr/gameplay/VRPlayer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/vivecraft/client_vr/gameplay/VRPlayer", "vrdata_world_render", "Lorg/vivecraft/client_vr/VRData;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/vivecraft/client_vr/VRData", "getController", "(I)Lorg/vivecraft/client_vr/VRData$VRDevicePose;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/vivecraft/client_vr/VRData$VRDevicePose", "getPosition", "()Lnet/minecraft/world/phys/Vec3;", false);
methodVisitor.visitInsn(ARETURN);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLocalVariable("controller", "I", null, label0, label1, 0);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getControllerRayDirection", "(I)Lorg/joml/Vector3f;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(32, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/tom/vivecraftcompat/VRHelper", "DATA_HOLDER", "Lorg/vivecraft/client_vr/ClientDataHolderVR;");
methodVisitor.visitFieldInsn(GETFIELD, "org/vivecraft/client_vr/ClientDataHolderVR", "vrPlayer", "Lorg/vivecraft/client_vr/gameplay/VRPlayer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/vivecraft/client_vr/gameplay/VRPlayer", "vrdata_world_render", "Lorg/vivecraft/client_vr/VRData;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/vivecraft/client_vr/VRData", "getController", "(I)Lorg/vivecraft/client_vr/VRData$VRDevicePose;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/vivecraft/client_vr/VRData$VRDevicePose", "getDirection", "()Lorg/joml/Vector3f;", false);
methodVisitor.visitInsn(ARETURN);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLocalVariable("controller", "I", null, label0, label1, 0);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(9, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/vivecraft/client_vr/ClientDataHolderVR", "getInstance", "()Lorg/vivecraft/client_vr/ClientDataHolderVR;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/tom/vivecraftcompat/VRHelper", "DATA_HOLDER", "Lorg/vivecraft/client_vr/ClientDataHolderVR;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
