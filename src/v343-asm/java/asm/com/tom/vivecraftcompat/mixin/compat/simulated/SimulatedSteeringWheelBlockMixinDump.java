// Generated reconstruction of the v3.4.3 class file using Java 21 ASMifier.
// This is low-level Java ASM source, NOT the original authored source.
// Part of a verified JVM bytecode preservation layer.
package asm.com.tom.vivecraftcompat.mixin.compat.simulated;
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
public class SimulatedSteeringWheelBlockMixinDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(65, ACC_PUBLIC | ACC_SUPER, "com/tom/vivecraftcompat/mixin/compat/simulated/SimulatedSteeringWheelBlockMixin", null, "java/lang/Object", null);

classWriter.visitSource("SimulatedSteeringWheelBlockMixin.java", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/spongepowered/asm/mixin/Mixin;", false);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("targets");
annotationVisitor1.visit(null, "dev.simulated_team.simulated.content.blocks.steering_wheel.SteeringWheelBlock");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(15, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/compat/simulated/SimulatedSteeringWheelBlockMixin;", null, label0, label1, 0);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "useVRRayOrigin", "(Lnet/minecraft/world/entity/player/Player;F)Lnet/minecraft/world/phys/Vec3;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Redirect;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "lookingAtWheel(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;FLnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/VoxelShape;)Z");
annotationVisitor1.visitEnd();
}
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitAnnotation("at", "Lorg/spongepowered/asm/mixin/injection/At;");
annotationVisitor1.visit("value", "INVOKE");
annotationVisitor1.visit("target", "Lnet/minecraft/world/entity/player/Player;getEyePosition(F)Lnet/minecraft/world/phys/Vec3;");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("remap", Boolean.FALSE);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(22, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/VRMode", "isVRHandAiming", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/VRHelper", "getRayOrigin", "()Lnet/minecraft/world/phys/Vec3;", false);
methodVisitor.visitVarInsn(FLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SableVRBridge", "getSeatedHandRayOrigin", "(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;F)Lnet/minecraft/world/phys/Vec3;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(23, label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(FLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/entity/player/Player", "getEyePosition", "(F)Lnet/minecraft/world/phys/Vec3;", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(22, label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"net/minecraft/world/phys/Vec3"});
methodVisitor.visitInsn(ARETURN);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLocalVariable("player", "Lnet/minecraft/world/entity/player/Player;", null, label0, label3, 0);
methodVisitor.visitLocalVariable("partialTick", "F", null, label0, label3, 1);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "useVRRayDirection", "(Lnet/minecraft/world/entity/player/Player;F)Lnet/minecraft/world/phys/Vec3;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Redirect;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "lookingAtWheel(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;FLnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/VoxelShape;)Z");
annotationVisitor1.visitEnd();
}
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitAnnotation("at", "Lorg/spongepowered/asm/mixin/injection/At;");
annotationVisitor1.visit("value", "INVOKE");
annotationVisitor1.visit("target", "Lnet/minecraft/world/entity/player/Player;getViewVector(F)Lnet/minecraft/world/phys/Vec3;");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("remap", Boolean.FALSE);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(31, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/VRMode", "isVRHandAiming", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(32, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(FLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/entity/player/Player", "getViewVector", "(F)Lnet/minecraft/world/phys/Vec3;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(34, label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/VRHelper", "getRayDirection", "()Lorg/joml/Vector3f;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(35, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "net/minecraft/world/phys/Vec3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/joml/Vector3f", "x", "F");
methodVisitor.visitInsn(F2D);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/joml/Vector3f", "y", "F");
methodVisitor.visitInsn(F2D);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/joml/Vector3f", "z", "F");
methodVisitor.visitInsn(F2D);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/minecraft/world/phys/Vec3", "<init>", "(DDD)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SableVRBridge", "getSeatedHandRayDirection", "(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", false);
methodVisitor.visitInsn(ARETURN);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLocalVariable("player", "Lnet/minecraft/world/entity/player/Player;", null, label0, label4, 0);
methodVisitor.visitLocalVariable("partialTick", "F", null, label0, label4, 1);
methodVisitor.visitLocalVariable("direction", "Lorg/joml/Vector3f;", null, label3, label4, 2);
methodVisitor.visitMaxs(9, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
