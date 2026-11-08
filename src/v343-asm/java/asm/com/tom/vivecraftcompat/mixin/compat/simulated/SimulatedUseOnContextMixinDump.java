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
public class SimulatedUseOnContextMixinDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(65, ACC_PUBLIC | ACC_SUPER, "com/tom/vivecraftcompat/mixin/compat/simulated/SimulatedUseOnContextMixin", null, "java/lang/Object", null);

classWriter.visitSource("SimulatedUseOnContextMixin.java", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/spongepowered/asm/mixin/Mixin;", false);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visit(null, Type.getType("Lnet/minecraft/world/item/context/UseOnContext;"));
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
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/compat/simulated/SimulatedUseOnContextMixin;", null, label0, label1, 0);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "vivecraftcompat$useSableLocalHorizontalDirection", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lnet/minecraft/core/Direction;>;)V", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "getHorizontalDirection");
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
methodVisitor.visitLineNumber(19, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "net/minecraft/world/item/context/UseOnContext");
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(20, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/item/context/UseOnContext", "getPlayer", "()Lnet/minecraft/world/entity/player/Player;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(21, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/item/context/UseOnContext", "getLevel", "()Lnet/minecraft/world/level/Level;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(22, label3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/item/context/UseOnContext", "getClickedPos", "()Lnet/minecraft/core/BlockPos;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/core/BlockPos", "getCenter", "()Lnet/minecraft/world/phys/Vec3;", false);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLineNumber(21, label4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SableVRBridge", "getSeatedPlacementHorizontalDirection", "(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/Position;)Lnet/minecraft/core/Direction;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitLineNumber(23, label5);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitLineNumber(24, label7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "setReturnValue", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitLineNumber(25, label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"net/minecraft/world/item/context/UseOnContext", "net/minecraft/world/entity/player/Player", "net/minecraft/core/Direction"}, 0, null);
methodVisitor.visitInsn(RETURN);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/compat/simulated/SimulatedUseOnContextMixin;", null, label0, label8, 0);
methodVisitor.visitLocalVariable("cir", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lnet/minecraft/core/Direction;>;", label0, label8, 1);
methodVisitor.visitLocalVariable("context", "Lnet/minecraft/world/item/context/UseOnContext;", null, label1, label8, 2);
methodVisitor.visitLocalVariable("player", "Lnet/minecraft/world/entity/player/Player;", null, label2, label8, 3);
methodVisitor.visitLocalVariable("direction", "Lnet/minecraft/core/Direction;", null, label5, label8, 4);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "vivecraftcompat$useSableLocalRotation", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Ljava/lang/Float;>;)V", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "getRotation");
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
methodVisitor.visitTypeInsn(CHECKCAST, "net/minecraft/world/item/context/UseOnContext");
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(30, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/item/context/UseOnContext", "getPlayer", "()Lnet/minecraft/world/entity/player/Player;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(31, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/item/context/UseOnContext", "getLevel", "()Lnet/minecraft/world/level/Level;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/item/context/UseOnContext", "getClickedPos", "()Lnet/minecraft/core/BlockPos;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/core/BlockPos", "getCenter", "()Lnet/minecraft/world/phys/Vec3;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SableVRBridge", "getSeatedPlacementYaw", "(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/Position;)Ljava/lang/Float;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(32, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitLineNumber(33, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "setReturnValue", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitLineNumber(34, label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"net/minecraft/world/item/context/UseOnContext", "net/minecraft/world/entity/player/Player", "java/lang/Float"}, 0, null);
methodVisitor.visitInsn(RETURN);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/compat/simulated/SimulatedUseOnContextMixin;", null, label0, label6, 0);
methodVisitor.visitLocalVariable("cir", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Ljava/lang/Float;>;", label0, label6, 1);
methodVisitor.visitLocalVariable("context", "Lnet/minecraft/world/item/context/UseOnContext;", null, label1, label6, 2);
methodVisitor.visitLocalVariable("player", "Lnet/minecraft/world/entity/player/Player;", null, label2, label6, 3);
methodVisitor.visitLocalVariable("yaw", "Ljava/lang/Float;", null, label3, label6, 4);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
