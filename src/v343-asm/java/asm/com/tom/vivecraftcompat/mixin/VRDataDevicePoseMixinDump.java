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
public class VRDataDevicePoseMixinDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(65, ACC_PUBLIC | ACC_SUPER, "com/tom/vivecraftcompat/mixin/VRDataDevicePoseMixin", null, "java/lang/Object", null);

classWriter.visitSource("VRDataDevicePoseMixin.java", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/spongepowered/asm/mixin/Mixin;", false);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visit(null, Type.getType("Lorg/vivecraft/client_vr/VRData$VRDevicePose;"));
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/vivecraft/client_vr/VRData$VRDevicePose", "org/vivecraft/client_vr/VRData", "VRDevicePose", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "data", "Lorg/vivecraft/client_vr/VRData;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/Shadow;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/Final;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(20, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/VRDataDevicePoseMixin;", null, label0, label1, 0);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "vivecraftcompat$transformSableVrPosition", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lnet/minecraft/world/phys/Vec3;>;)V", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "getPosition");
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
methodVisitor.visitLineNumber(27, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/mixin/VRDataDevicePoseMixin", "data", "Lorg/vivecraft/client_vr/VRData;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "getReturnValue", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "net/minecraft/world/phys/Vec3");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SableVRBridge", "transformVrPosition", "(Lorg/vivecraft/client_vr/VRData;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "setReturnValue", "(Ljava/lang/Object;)V", false);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(28, label1);
methodVisitor.visitInsn(RETURN);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/VRDataDevicePoseMixin;", null, label0, label2, 0);
methodVisitor.visitLocalVariable("cir", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lnet/minecraft/world/phys/Vec3;>;", label0, label2, 1);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "vivecraftcompat$transformSableVrPositionF", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lorg/joml/Vector3f;>;)V", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "getPositionF");
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
methodVisitor.visitLineNumber(32, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "getReturnValue", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/joml/Vector3f");
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(33, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/mixin/VRDataDevicePoseMixin", "data", "Lorg/vivecraft/client_vr/VRData;");
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
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SableVRBridge", "transformVrPosition", "(Lorg/vivecraft/client_vr/VRData;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(35, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/joml/Vector3f");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "net/minecraft/world/phys/Vec3", "x", "D");
methodVisitor.visitInsn(D2F);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "net/minecraft/world/phys/Vec3", "y", "D");
methodVisitor.visitInsn(D2F);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "net/minecraft/world/phys/Vec3", "z", "D");
methodVisitor.visitInsn(D2F);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joml/Vector3f", "<init>", "(FFF)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "setReturnValue", "(Ljava/lang/Object;)V", false);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(36, label3);
methodVisitor.visitInsn(RETURN);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/VRDataDevicePoseMixin;", null, label0, label4, 0);
methodVisitor.visitLocalVariable("cir", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lorg/joml/Vector3f;>;", label0, label4, 1);
methodVisitor.visitLocalVariable("position", "Lorg/joml/Vector3f;", null, label1, label4, 2);
methodVisitor.visitLocalVariable("transformed", "Lnet/minecraft/world/phys/Vec3;", null, label2, label4, 3);
methodVisitor.visitMaxs(9, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "vivecraftcompat$transformSableVrScaleOffset", "(FLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V", "(FLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lorg/joml/Vector3f;>;)V", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "getScalePositionOffset");
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
methodVisitor.visitLineNumber(40, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/mixin/VRDataDevicePoseMixin", "data", "Lorg/vivecraft/client_vr/VRData;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "getReturnValue", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/joml/Vector3f");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SableVRBridge", "transformVrDirection", "(Lorg/vivecraft/client_vr/VRData;Lorg/joml/Vector3f;)Lorg/joml/Vector3f;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "setReturnValue", "(Ljava/lang/Object;)V", false);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(41, label1);
methodVisitor.visitInsn(RETURN);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/VRDataDevicePoseMixin;", null, label0, label2, 0);
methodVisitor.visitLocalVariable("scale", "F", null, label0, label2, 1);
methodVisitor.visitLocalVariable("cir", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lorg/joml/Vector3f;>;", label0, label2, 2);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "vivecraftcompat$transformSableVrDirection", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lorg/joml/Vector3f;>;)V", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "getDirection");
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
methodVisitor.visitLineNumber(45, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/mixin/VRDataDevicePoseMixin", "data", "Lorg/vivecraft/client_vr/VRData;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "getReturnValue", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/joml/Vector3f");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SableVRBridge", "transformVrDirection", "(Lorg/vivecraft/client_vr/VRData;Lorg/joml/Vector3f;)Lorg/joml/Vector3f;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "setReturnValue", "(Ljava/lang/Object;)V", false);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(46, label1);
methodVisitor.visitInsn(RETURN);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/VRDataDevicePoseMixin;", null, label0, label2, 0);
methodVisitor.visitLocalVariable("cir", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lorg/joml/Vector3f;>;", label0, label2, 1);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "vivecraftcompat$transformSableVrCustomVector", "(Lorg/joml/Vector3fc;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V", "(Lorg/joml/Vector3fc;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lorg/joml/Vector3f;>;)V", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "getCustomVector");
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
methodVisitor.visitLineNumber(51, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/mixin/VRDataDevicePoseMixin", "data", "Lorg/vivecraft/client_vr/VRData;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "getReturnValue", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/joml/Vector3f");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SableVRBridge", "transformVrDirection", "(Lorg/vivecraft/client_vr/VRData;Lorg/joml/Vector3f;)Lorg/joml/Vector3f;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "setReturnValue", "(Ljava/lang/Object;)V", false);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(52, label1);
methodVisitor.visitInsn(RETURN);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/VRDataDevicePoseMixin;", null, label0, label2, 0);
methodVisitor.visitLocalVariable("vector", "Lorg/joml/Vector3fc;", null, label0, label2, 1);
methodVisitor.visitLocalVariable("cir", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lorg/joml/Vector3f;>;", label0, label2, 2);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "vivecraftcompat$transformSableVrMatrix", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lorg/joml/Matrix4f;>;)V", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "getMatrix");
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
methodVisitor.visitLineNumber(56, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/mixin/VRDataDevicePoseMixin", "data", "Lorg/vivecraft/client_vr/VRData;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "getReturnValue", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/joml/Matrix4f");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SableVRBridge", "transformVrMatrix", "(Lorg/vivecraft/client_vr/VRData;Lorg/joml/Matrix4f;)Lorg/joml/Matrix4f;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "setReturnValue", "(Ljava/lang/Object;)V", false);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(57, label1);
methodVisitor.visitInsn(RETURN);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/VRDataDevicePoseMixin;", null, label0, label2, 0);
methodVisitor.visitLocalVariable("cir", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lorg/joml/Matrix4f;>;", label0, label2, 1);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
