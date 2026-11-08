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
public class SimulatedBlockPlaceContextMixinDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(65, ACC_PUBLIC | ACC_SUPER, "com/tom/vivecraftcompat/mixin/compat/simulated/SimulatedBlockPlaceContextMixin", null, "java/lang/Object", null);

classWriter.visitSource("SimulatedBlockPlaceContextMixin.java", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/spongepowered/asm/mixin/Mixin;", false);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visit(null, Type.getType("Lnet/minecraft/world/item/context/BlockPlaceContext;"));
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "replaceClicked", "Z", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/Shadow;", true);
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
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/compat/simulated/SimulatedBlockPlaceContextMixin;", null, label0, label1, 0);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "vivecraftcompat$useSableLocalNearestDirection", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lnet/minecraft/core/Direction;>;)V", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "getNearestLookingDirection");
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
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(22, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/tom/vivecraftcompat/mixin/compat/simulated/SimulatedBlockPlaceContextMixin", "getSableLocalDirections", "()[Lnet/minecraft/core/Direction;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(23, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(24, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "setReturnValue", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(25, label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Lnet/minecraft/core/Direction;"}, 0, null);
methodVisitor.visitInsn(RETURN);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/compat/simulated/SimulatedBlockPlaceContextMixin;", null, label0, label4, 0);
methodVisitor.visitLocalVariable("cir", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lnet/minecraft/core/Direction;>;", label0, label4, 1);
methodVisitor.visitLocalVariable("directions", "[Lnet/minecraft/core/Direction;", null, label1, label4, 2);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "vivecraftcompat$useSableLocalVerticalDirection", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lnet/minecraft/core/Direction;>;)V", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "getNearestLookingVerticalDirection");
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
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(29, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "net/minecraft/world/item/context/BlockPlaceContext");
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(30, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/item/context/BlockPlaceContext", "getPlayer", "()Lnet/minecraft/world/entity/player/Player;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(31, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/item/context/BlockPlaceContext", "getLevel", "()Lnet/minecraft/world/level/Level;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(32, label3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/item/context/BlockPlaceContext", "getClickedPos", "()Lnet/minecraft/core/BlockPos;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/core/BlockPos", "getCenter", "()Lnet/minecraft/world/phys/Vec3;", false);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLineNumber(31, label4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SableVRBridge", "getSeatedPlacementVerticalDirection", "(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/Position;)Lnet/minecraft/core/Direction;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitLineNumber(33, label5);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitLineNumber(34, label7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "setReturnValue", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitLineNumber(35, label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"net/minecraft/world/item/context/BlockPlaceContext", "net/minecraft/world/entity/player/Player", "net/minecraft/core/Direction"}, 0, null);
methodVisitor.visitInsn(RETURN);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/compat/simulated/SimulatedBlockPlaceContextMixin;", null, label0, label8, 0);
methodVisitor.visitLocalVariable("cir", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lnet/minecraft/core/Direction;>;", label0, label8, 1);
methodVisitor.visitLocalVariable("context", "Lnet/minecraft/world/item/context/BlockPlaceContext;", null, label1, label8, 2);
methodVisitor.visitLocalVariable("player", "Lnet/minecraft/world/entity/player/Player;", null, label2, label8, 3);
methodVisitor.visitLocalVariable("direction", "Lnet/minecraft/core/Direction;", null, label5, label8, 4);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "vivecraftcompat$useSableLocalDirections", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<[Lnet/minecraft/core/Direction;>;)V", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "getNearestLookingDirections");
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
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(39, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/tom/vivecraftcompat/mixin/compat/simulated/SimulatedBlockPlaceContextMixin", "getSableLocalDirections", "()[Lnet/minecraft/core/Direction;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(40, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(41, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "setReturnValue", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(42, label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Lnet/minecraft/core/Direction;"}, 0, null);
methodVisitor.visitInsn(RETURN);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/compat/simulated/SimulatedBlockPlaceContextMixin;", null, label0, label4, 0);
methodVisitor.visitLocalVariable("cir", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<[Lnet/minecraft/core/Direction;>;", label0, label4, 1);
methodVisitor.visitLocalVariable("directions", "[Lnet/minecraft/core/Direction;", null, label1, label4, 2);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getSableLocalDirections", "()[Lnet/minecraft/core/Direction;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(45, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "net/minecraft/world/item/context/BlockPlaceContext");
methodVisitor.visitVarInsn(ASTORE, 1);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(46, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/item/context/BlockPlaceContext", "getPlayer", "()Lnet/minecraft/world/entity/player/Player;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(47, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/item/context/BlockPlaceContext", "getLevel", "()Lnet/minecraft/world/level/Level;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(48, label3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/item/context/BlockPlaceContext", "getClickedPos", "()Lnet/minecraft/core/BlockPos;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/core/BlockPos", "getCenter", "()Lnet/minecraft/world/phys/Vec3;", false);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLineNumber(47, label4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SableVRBridge", "getSeatedPlacementDirections", "(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/Position;)[Lnet/minecraft/core/Direction;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitLineNumber(49, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitLineNumber(50, label7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitLineNumber(52, label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"net/minecraft/world/item/context/BlockPlaceContext", "net/minecraft/world/entity/player/Player", "[Lnet/minecraft/core/Direction;"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/mixin/compat/simulated/SimulatedBlockPlaceContextMixin", "replaceClicked", "Z");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
Label label9 = new Label();
methodVisitor.visitLabel(label9);
methodVisitor.visitLineNumber(53, label9);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitLineNumber(55, label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/item/context/BlockPlaceContext", "getClickedFace", "()Lnet/minecraft/core/Direction;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/core/Direction", "getOpposite", "()Lnet/minecraft/core/Direction;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label10 = new Label();
methodVisitor.visitLabel(label10);
methodVisitor.visitLineNumber(56, label10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label11 = new Label();
methodVisitor.visitLabel(label11);
methodVisitor.visitLineNumber(57, label11);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"net/minecraft/core/Direction", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label12);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitJumpInsn(IF_ACMPEQ, label12);
Label label13 = new Label();
methodVisitor.visitLabel(label13);
methodVisitor.visitLineNumber(58, label13);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label12);
methodVisitor.visitLineNumber(60, label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFLE, label14);
Label label15 = new Label();
methodVisitor.visitLabel(label15);
methodVisitor.visitLineNumber(61, label15);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
Label label16 = new Label();
methodVisitor.visitLabel(label16);
methodVisitor.visitLineNumber(62, label16);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitLabel(label14);
methodVisitor.visitLineNumber(65, label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
Label label17 = new Label();
methodVisitor.visitLabel(label17);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/compat/simulated/SimulatedBlockPlaceContextMixin;", null, label0, label17, 0);
methodVisitor.visitLocalVariable("context", "Lnet/minecraft/world/item/context/BlockPlaceContext;", null, label1, label17, 1);
methodVisitor.visitLocalVariable("player", "Lnet/minecraft/world/entity/player/Player;", null, label2, label17, 2);
methodVisitor.visitLocalVariable("directions", "[Lnet/minecraft/core/Direction;", null, label5, label17, 3);
methodVisitor.visitLocalVariable("forced", "Lnet/minecraft/core/Direction;", null, label10, label17, 4);
methodVisitor.visitLocalVariable("index", "I", null, label11, label17, 5);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
