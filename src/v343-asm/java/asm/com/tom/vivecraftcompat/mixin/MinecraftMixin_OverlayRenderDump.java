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
public class MinecraftMixin_OverlayRenderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(65, ACC_PUBLIC | ACC_SUPER, "com/tom/vivecraftcompat/mixin/MinecraftMixin_OverlayRender", null, "java/lang/Object", null);

classWriter.visitSource("MinecraftMixin_OverlayRender.java", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/spongepowered/asm/mixin/Mixin;", false);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visit(null, Type.getType("Lnet/minecraft/client/Minecraft;"));
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("priority", new Integer(500));
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("net/minecraft/client/DeltaTracker$Timer", "net/minecraft/client/DeltaTracker", "Timer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/spongepowered/asm/mixin/injection/At$Shift", "org/spongepowered/asm/mixin/injection/At", "Shift", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "timer", "Lnet/minecraft/client/DeltaTracker$Timer;", null, null);
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
methodVisitor.visitLineNumber(17, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/MinecraftMixin_OverlayRender;", null, label0, label1, 0);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "syncPhysicsSeatBeforeRender", "(ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("at");
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Lorg/spongepowered/asm/mixin/injection/At;");
annotationVisitor2.visit("value", "INVOKE");
annotationVisitor2.visit("target", "Lnet/neoforged/neoforge/client/ClientHooks;fireRenderFramePre(Lnet/minecraft/client/DeltaTracker;)V");
annotationVisitor2.visitEnum("shift", "Lorg/spongepowered/asm/mixin/injection/At$Shift;", "BEFORE");
annotationVisitor2.visitEnd();
}
annotationVisitor1.visitEnd();
}
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "runTick");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(24, label0);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(25, label2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SableVRBridge", "syncSeatedPhysicsRotationFrame", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(26, label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/MinecraftMixin_OverlayRender;", null, label0, label3, 0);
methodVisitor.visitLocalVariable("renderLevel", "Z", null, label0, label3, 1);
methodVisitor.visitLocalVariable("ci", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;", null, label0, label3, 2);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "renderOverlayPasses", "(ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("at");
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Lorg/spongepowered/asm/mixin/injection/At;");
annotationVisitor2.visit("value", "INVOKE");
annotationVisitor2.visit("target", "Lnet/neoforged/neoforge/client/ClientHooks;fireRenderFramePost(Lnet/minecraft/client/DeltaTracker;)V");
annotationVisitor2.visitEnum("shift", "Lorg/spongepowered/asm/mixin/injection/At$Shift;", "AFTER");
annotationVisitor2.visitEnd();
}
annotationVisitor1.visitEnd();
}
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "runTick");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(30, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/mixin/MinecraftMixin_OverlayRender", "timer", "Lnet/minecraft/client/DeltaTracker$Timer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/overlay/OverlayManager", "drawLayers", "(Lnet/minecraft/client/DeltaTracker$Timer;)V", false);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(31, label1);
methodVisitor.visitInsn(RETURN);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/MinecraftMixin_OverlayRender;", null, label0, label2, 0);
methodVisitor.visitLocalVariable("renderLevel", "Z", null, label0, label2, 1);
methodVisitor.visitLocalVariable("ci", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;", null, label0, label2, 2);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
