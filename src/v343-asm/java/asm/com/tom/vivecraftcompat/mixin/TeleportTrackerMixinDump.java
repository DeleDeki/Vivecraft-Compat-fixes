// Generated reconstruction of the v3.4.3 class file using Java 21 ASMifier.
// This is low-level Java ASM source, NOT the original authored source.
// Part of a verified JVM bytecode preservation layer.
package asm.com.tom.vivecraftcompat.mixin;
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
public class TeleportTrackerMixinDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(65, ACC_PUBLIC | ACC_SUPER, "com/tom/vivecraftcompat/mixin/TeleportTrackerMixin", null, "java/lang/Object", null);

classWriter.visitSource("TeleportTrackerMixin.java", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/spongepowered/asm/mixin/Mixin;", false);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("targets");
annotationVisitor1.visit(null, "org.vivecraft.client_vr.gameplay.trackers.TeleportTracker");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MAX_REASONABLE_TELEPORT_DISTANCE", "D", null, new Double("128.0"));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MAX_DESTINATION_DISTANCE_FROM_HIT", "D", null, new Double("8.0"));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "movementTeleportDestination", "Lnet/minecraft/world/phys/Vec3;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/Shadow;", true);
annotationVisitor0.visit("remap", Boolean.FALSE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "movementTeleportDistance", "D", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/Shadow;", true);
annotationVisitor0.visit("remap", Boolean.FALSE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "movementTeleportArcSteps", "I", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/Shadow;", true);
annotationVisitor0.visit("remap", Boolean.FALSE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(16, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/TeleportTrackerMixin;", null, label0, label1, 0);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "vivecraftcompat$disableTeleportForSchematicAlt", "(Lnet/minecraft/client/player/LocalPlayer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V", "(Lnet/minecraft/client/player/LocalPlayer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Ljava/lang/Boolean;>;)V", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "isActive");
annotationVisitor1.visitEnd();
}
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("at");
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Lorg/spongepowered/asm/mixin/injection/At;");
annotationVisitor2.visit("value", "HEAD");
annotationVisitor2.visitEnd();
}
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("cancellable", Boolean.TRUE);
annotationVisitor0.visit("remap", Boolean.FALSE);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(31, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/create/CreateSchematicVRInputBridge", "shouldSuppressTeleport", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(32, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "setReturnValue", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(33, label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/TeleportTrackerMixin;", null, label0, label3, 0);
methodVisitor.visitLocalVariable("player", "Lnet/minecraft/client/player/LocalPlayer;", null, label0, label3, 1);
methodVisitor.visitLocalVariable("cir", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Ljava/lang/Boolean;>;", label0, label3, 2);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "vivecraftcompat$rejectBadPhysicsTeleport", "(Lnet/minecraft/client/player/LocalPlayer;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/BlockHitResult;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V", "(Lnet/minecraft/client/player/LocalPlayer;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/BlockHitResult;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Ljava/lang/Boolean;>;)V", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "checkAndSetTeleportDestination");
annotationVisitor1.visitEnd();
}
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("at");
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Lorg/spongepowered/asm/mixin/injection/At;");
annotationVisitor2.visit("value", "RETURN");
annotationVisitor2.visitEnd();
}
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("cancellable", Boolean.TRUE);
annotationVisitor0.visit("remap", Boolean.FALSE);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(38, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "getReturnValueZ", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(39, label2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(41, label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/mixin/TeleportTrackerMixin", "movementTeleportDestination", "Lnet/minecraft/world/phys/Vec3;");
methodVisitor.visitVarInsn(ASTORE, 5);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(42, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/mixin/TeleportTrackerMixin", "isBadTeleportDestination", "(Lnet/minecraft/client/player/LocalPlayer;Lnet/minecraft/world/phys/BlockHitResult;Lnet/minecraft/world/phys/Vec3;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitLineNumber(43, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "net/minecraft/world/phys/Vec3", "ZERO", "Lnet/minecraft/world/phys/Vec3;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/tom/vivecraftcompat/mixin/TeleportTrackerMixin", "movementTeleportDestination", "Lnet/minecraft/world/phys/Vec3;");
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitLineNumber(44, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/tom/vivecraftcompat/mixin/TeleportTrackerMixin", "movementTeleportDistance", "D");
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitLineNumber(45, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/tom/vivecraftcompat/mixin/TeleportTrackerMixin", "movementTeleportArcSteps", "I");
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitLineNumber(46, label8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "setReturnValue", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitLineNumber(48, label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"net/minecraft/world/phys/Vec3"}, 0, null);
methodVisitor.visitInsn(RETURN);
Label label9 = new Label();
methodVisitor.visitLabel(label9);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/TeleportTrackerMixin;", null, label0, label9, 0);
methodVisitor.visitLocalVariable("player", "Lnet/minecraft/client/player/LocalPlayer;", null, label0, label9, 1);
methodVisitor.visitLocalVariable("arcStart", "Lnet/minecraft/world/phys/Vec3;", null, label0, label9, 2);
methodVisitor.visitLocalVariable("hit", "Lnet/minecraft/world/phys/BlockHitResult;", null, label0, label9, 3);
methodVisitor.visitLocalVariable("cir", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Ljava/lang/Boolean;>;", label0, label9, 4);
methodVisitor.visitLocalVariable("destination", "Lnet/minecraft/world/phys/Vec3;", null, label3, label9, 5);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "isBadTeleportDestination", "(Lnet/minecraft/client/player/LocalPlayer;Lnet/minecraft/world/phys/BlockHitResult;Lnet/minecraft/world/phys/Vec3;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(51, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(52, label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(53, label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/mixin/TeleportTrackerMixin", "isFinite", "(Lnet/minecraft/world/phys/Vec3;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLineNumber(54, label4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(55, label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/client/player/LocalPlayer", "position", "()Lnet/minecraft/world/phys/Vec3;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/phys/Vec3", "distanceTo", "(Lnet/minecraft/world/phys/Vec3;)D", false);
methodVisitor.visitLdcInsn(new Double("128.0"));
methodVisitor.visitInsn(DCMPL);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFLE, label5);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitLineNumber(56, label6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitLineNumber(58, label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/phys/BlockHitResult", "getLocation", "()Lnet/minecraft/world/phys/Vec3;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitLineNumber(59, label7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/mixin/TeleportTrackerMixin", "isFinite", "(Lnet/minecraft/world/phys/Vec3;)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNE, label8);
Label label9 = new Label();
methodVisitor.visitLabel(label9);
methodVisitor.visitLineNumber(60, label9);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitLineNumber(62, label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"net/minecraft/world/phys/Vec3"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/phys/Vec3", "distanceTo", "(Lnet/minecraft/world/phys/Vec3;)D", false);
methodVisitor.visitLdcInsn(new Double("8.0"));
methodVisitor.visitInsn(DCMPL);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFLE, label10);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label11 = new Label();
methodVisitor.visitLabel(label11);
methodVisitor.visitLineNumber(63, label11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/phys/BlockHitResult", "getBlockPos", "()Lnet/minecraft/core/BlockPos;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/minecraft/world/phys/Vec3", "atCenterOf", "(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/world/phys/Vec3;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/phys/Vec3", "distanceTo", "(Lnet/minecraft/world/phys/Vec3;)D", false);
methodVisitor.visitLdcInsn(new Double("8.0"));
methodVisitor.visitInsn(DCMPL);
methodVisitor.visitJumpInsn(IFLE, label10);
methodVisitor.visitInsn(ICONST_1);
Label label12 = new Label();
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label12);
methodVisitor.visitLineNumber(62, label12);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
Label label13 = new Label();
methodVisitor.visitLabel(label13);
methodVisitor.visitLocalVariable("player", "Lnet/minecraft/client/player/LocalPlayer;", null, label0, label13, 0);
methodVisitor.visitLocalVariable("hit", "Lnet/minecraft/world/phys/BlockHitResult;", null, label0, label13, 1);
methodVisitor.visitLocalVariable("destination", "Lnet/minecraft/world/phys/Vec3;", null, label0, label13, 2);
methodVisitor.visitLocalVariable("hitLocation", "Lnet/minecraft/world/phys/Vec3;", null, label7, label13, 3);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "isFinite", "(Lnet/minecraft/world/phys/Vec3;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(67, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/minecraft/world/phys/Vec3", "x", "D");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Double", "isFinite", "(D)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/minecraft/world/phys/Vec3", "y", "D");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Double", "isFinite", "(D)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/minecraft/world/phys/Vec3", "z", "D");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Double", "isFinite", "(D)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLocalVariable("value", "Lnet/minecraft/world/phys/Vec3;", null, label0, label3, 0);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
