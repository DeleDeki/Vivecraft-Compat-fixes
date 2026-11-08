// Generated reconstruction of the v3.4.3 class file using Java 21 ASMifier.
// This is low-level Java ASM source, NOT the original authored source.
// Part of a verified JVM bytecode preservation layer.
package asm.com.tom.vivecraftcompat.mixin.compat.create;
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
public class CreateRaycastHelperMixinDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(65, ACC_PUBLIC | ACC_SUPER, "com/tom/vivecraftcompat/mixin/compat/create/CreateRaycastHelperMixin", null, "java/lang/Object", null);

classWriter.visitSource("CreateRaycastHelperMixin.java", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/spongepowered/asm/mixin/Mixin;", false);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visit(null, Type.getType("Lcom/simibubi/create/foundation/utility/RaycastHelper;"));
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(18, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/compat/create/CreateRaycastHelperMixin;", null, label0, label1, 0);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "onGetTraceTarget", "(Lnet/minecraft/world/entity/player/Player;DLnet/minecraft/world/phys/Vec3;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V", "(Lnet/minecraft/world/entity/player/Player;DLnet/minecraft/world/phys/Vec3;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lnet/minecraft/world/phys/Vec3;>;)V", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("at");
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Lorg/spongepowered/asm/mixin/injection/At;");
annotationVisitor2.visit("value", "HEAD");
annotationVisitor2.visitEnd();
}
annotationVisitor1.visitEnd();
}
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "getTraceTarget");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("cancellable", Boolean.TRUE);
annotationVisitor0.visit("remap", Boolean.FALSE);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(22, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/entity/player/Player", "level", "()Lnet/minecraft/world/level/Level;", false);
methodVisitor.visitFieldInsn(GETFIELD, "net/minecraft/world/level/Level", "isClientSide", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/VRMode", "isVRHandAiming", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(23, label2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/VRHelper", "getRayDirection", "()Lorg/joml/Vector3f;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(24, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "org/joml/Vector3f", "x", "F");
methodVisitor.visitInsn(F2D);
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitInsn(DMUL);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "org/joml/Vector3f", "y", "F");
methodVisitor.visitInsn(F2D);
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitInsn(DMUL);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "org/joml/Vector3f", "z", "F");
methodVisitor.visitInsn(F2D);
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitInsn(DMUL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/phys/Vec3", "add", "(DDD)Lnet/minecraft/world/phys/Vec3;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "setReturnValue", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(26, label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLocalVariable("d", "Lorg/joml/Vector3f;", null, label3, label1, 5);
methodVisitor.visitLocalVariable("playerIn", "Lnet/minecraft/world/entity/player/Player;", null, label0, label4, 0);
methodVisitor.visitLocalVariable("range", "D", null, label0, label4, 1);
methodVisitor.visitLocalVariable("origin", "Lnet/minecraft/world/phys/Vec3;", null, label0, label4, 3);
methodVisitor.visitLocalVariable("cbi", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Lnet/minecraft/world/phys/Vec3;>;", label0, label4, 4);
methodVisitor.visitMaxs(10, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
