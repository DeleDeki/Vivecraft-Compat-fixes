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
public class VREffectsHelperMixinDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(65, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "com/tom/vivecraftcompat/mixin/VREffectsHelperMixin", null, "java/lang/Object", null);

classWriter.visitSource("VREffectsHelperMixin.java", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/spongepowered/asm/mixin/Mixin;", false);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visit(null, Type.getType("Lorg/vivecraft/client_vr/render/helpers/VREffectsHelper;"));
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("com/tom/vivecraftcompat/overlay/OverlayManager$Layer", "com/tom/vivecraftcompat/overlay/OverlayManager", "Layer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "stableGuiModelViewDepth", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(26, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/VREffectsHelperMixin;", null, label0, label1, 0);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "suppressSableVrTransformForGui", "(FZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V", null, null);
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
annotationVisitor1.visit(null, "renderGuiAndShadow");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("remap", Boolean.FALSE);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(32, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SableVRBridge", "pushGuiVrTransformSuppression", "()V", false);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(33, label1);
methodVisitor.visitInsn(RETURN);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLocalVariable("partialTicks", "F", null, label0, label2, 0);
methodVisitor.visitLocalVariable("depthAlways", "Z", null, label0, label2, 1);
methodVisitor.visitLocalVariable("shadowFirst", "Z", null, label0, label2, 2);
methodVisitor.visitLocalVariable("cbi", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;", null, label0, label2, 3);
methodVisitor.visitMaxs(0, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "restoreSableVrTransformAfterGui", "(FZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("at");
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Lorg/spongepowered/asm/mixin/injection/At;");
annotationVisitor2.visit("value", "RETURN");
annotationVisitor2.visitEnd();
}
annotationVisitor1.visitEnd();
}
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "renderGuiAndShadow");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("remap", Boolean.FALSE);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(38, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SableVRBridge", "popGuiVrTransformSuppression", "()V", false);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(39, label1);
methodVisitor.visitInsn(RETURN);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLocalVariable("partialTicks", "F", null, label0, label2, 0);
methodVisitor.visitLocalVariable("depthAlways", "Z", null, label0, label2, 1);
methodVisitor.visitLocalVariable("shadowFirst", "Z", null, label0, label2, 2);
methodVisitor.visitLocalVariable("cbi", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;", null, label0, label2, 3);
methodVisitor.visitMaxs(0, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "pushStableModelViewForGuiLayer", "(FZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V", null, null);
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
annotationVisitor1.visit(null, "renderGuiLayer");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("remap", Boolean.FALSE);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(43, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/mixin/VREffectsHelperMixin", "pushStableGuiModelView", "()V", false);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(44, label1);
methodVisitor.visitInsn(RETURN);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLocalVariable("partialTicks", "F", null, label0, label2, 0);
methodVisitor.visitLocalVariable("depthAlways", "Z", null, label0, label2, 1);
methodVisitor.visitLocalVariable("cbi", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;", null, label0, label2, 2);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "popStableModelViewForGuiLayer", "(FZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("at");
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Lorg/spongepowered/asm/mixin/injection/At;");
annotationVisitor2.visit("value", "RETURN");
annotationVisitor2.visitEnd();
}
annotationVisitor1.visitEnd();
}
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "renderGuiLayer");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("remap", Boolean.FALSE);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(48, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/mixin/VREffectsHelperMixin", "popStableGuiModelView", "()V", false);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(49, label1);
methodVisitor.visitInsn(RETURN);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLocalVariable("partialTicks", "F", null, label0, label2, 0);
methodVisitor.visitLocalVariable("depthAlways", "Z", null, label0, label2, 1);
methodVisitor.visitLocalVariable("cbi", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;", null, label0, label2, 2);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "pushStableModelViewForRender2D", "(FLcom/mojang/blaze3d/pipeline/RenderTarget;Lorg/joml/Vector3fc;Lorg/joml/Matrix4f;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V", null, null);
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
annotationVisitor1.visit(null, "render2D");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("remap", Boolean.FALSE);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(54, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/mixin/VREffectsHelperMixin", "pushStableGuiModelView", "()V", false);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(55, label1);
methodVisitor.visitInsn(RETURN);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLocalVariable("partialTicks", "F", null, label0, label2, 0);
methodVisitor.visitLocalVariable("framebuffer", "Lcom/mojang/blaze3d/pipeline/RenderTarget;", null, label0, label2, 1);
methodVisitor.visitLocalVariable("pos", "Lorg/joml/Vector3fc;", null, label0, label2, 2);
methodVisitor.visitLocalVariable("rotation", "Lorg/joml/Matrix4f;", null, label0, label2, 3);
methodVisitor.visitLocalVariable("depthAlways", "Z", null, label0, label2, 4);
methodVisitor.visitLocalVariable("cbi", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;", null, label0, label2, 5);
methodVisitor.visitMaxs(0, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "popStableModelViewForRender2D", "(FLcom/mojang/blaze3d/pipeline/RenderTarget;Lorg/joml/Vector3fc;Lorg/joml/Matrix4f;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("at");
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Lorg/spongepowered/asm/mixin/injection/At;");
annotationVisitor2.visit("value", "RETURN");
annotationVisitor2.visitEnd();
}
annotationVisitor1.visitEnd();
}
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "render2D");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("remap", Boolean.FALSE);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(60, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/mixin/VREffectsHelperMixin", "popStableGuiModelView", "()V", false);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(61, label1);
methodVisitor.visitInsn(RETURN);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLocalVariable("partialTicks", "F", null, label0, label2, 0);
methodVisitor.visitLocalVariable("framebuffer", "Lcom/mojang/blaze3d/pipeline/RenderTarget;", null, label0, label2, 1);
methodVisitor.visitLocalVariable("pos", "Lorg/joml/Vector3fc;", null, label0, label2, 2);
methodVisitor.visitLocalVariable("rotation", "Lorg/joml/Matrix4f;", null, label0, label2, 3);
methodVisitor.visitLocalVariable("depthAlways", "Z", null, label0, label2, 4);
methodVisitor.visitLocalVariable("cbi", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;", null, label0, label2, 5);
methodVisitor.visitMaxs(0, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "pushStableModelViewForPhysicalKeyboard", "(FLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V", null, null);
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
annotationVisitor1.visit(null, "renderPhysicalKeyboard");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("remap", Boolean.FALSE);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(65, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/mixin/VREffectsHelperMixin", "pushStableGuiModelView", "()V", false);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(66, label1);
methodVisitor.visitInsn(RETURN);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLocalVariable("partialTicks", "F", null, label0, label2, 0);
methodVisitor.visitLocalVariable("cbi", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;", null, label0, label2, 1);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "popStableModelViewForPhysicalKeyboard", "(FLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("at");
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Lorg/spongepowered/asm/mixin/injection/At;");
annotationVisitor2.visit("value", "RETURN");
annotationVisitor2.visitEnd();
}
annotationVisitor1.visitEnd();
}
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "renderPhysicalKeyboard");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("remap", Boolean.FALSE);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(70, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/mixin/VREffectsHelperMixin", "popStableGuiModelView", "()V", false);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(71, label1);
methodVisitor.visitInsn(RETURN);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLocalVariable("partialTicks", "F", null, label0, label2, 0);
methodVisitor.visitLocalVariable("cbi", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;", null, label0, label2, 1);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "renderHudLayers", "(FZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("at");
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Lorg/spongepowered/asm/mixin/injection/At;");
annotationVisitor2.visit("value", "FIELD");
annotationVisitor2.visit("target", "Lorg/vivecraft/client_vr/gameplay/screenhandlers/KeyboardHandler;SHOWING:Z");
annotationVisitor2.visit("opcode", new Integer(178));
annotationVisitor2.visit("ordinal", new Integer(1));
annotationVisitor2.visit("remap", Boolean.FALSE);
annotationVisitor2.visitEnd();
}
annotationVisitor1.visitEnd();
}
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "renderGuiAndShadow");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("remap", Boolean.FALSE);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(FLOAD, 0);
methodVisitor.visitInvokeDynamicInsn("accept", "(F)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/tom/vivecraftcompat/mixin/VREffectsHelperMixin", "lambda$renderHudLayers$0", "(FLcom/tom/vivecraftcompat/overlay/OverlayManager$Layer;)V", false), Type.getType("(Lcom/tom/vivecraftcompat/overlay/OverlayManager$Layer;)V")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/overlay/OverlayManager", "renderLayers", "(Ljava/util/function/Consumer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "shouldRenderCrosshair", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V", "(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Ljava/lang/Boolean;>;)V", null);
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
annotationVisitor1.visit(null, "shouldRenderCrosshair");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("remap", Boolean.FALSE);
annotationVisitor0.visit("cancellable", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(84, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/overlay/OverlayManager", "isUsingController", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable", "setReturnValue", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(85, label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLocalVariable("cbi", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Ljava/lang/Boolean;>;", label0, label2, 0);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "pushStableGuiModelView", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(88, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SableVRBridge", "shouldStabilizeGuiVrModelView", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(89, label2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(91, label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "com/tom/vivecraftcompat/mixin/VREffectsHelperMixin", "stableGuiModelViewDepth", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/tom/vivecraftcompat/mixin/VREffectsHelperMixin", "stableGuiModelViewDepth", "I");
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(92, label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SableVRBridge", "pushGuiVrTransformSuppression", "()V", false);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLineNumber(93, label4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/mojang/blaze3d/systems/RenderSystem", "getModelViewStack", "()Lorg/joml/Matrix4fStack;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitLineNumber(94, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joml/Matrix4fStack", "pushMatrix", "()Lorg/joml/Matrix4fStack;", false);
methodVisitor.visitInsn(POP);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitLineNumber(95, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joml/Matrix4fStack", "identity", "()Lorg/joml/Matrix4f;", false);
methodVisitor.visitInsn(POP);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitLineNumber(96, label7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/vivecraft/client_vr/ClientDataHolderVR", "getInstance", "()Lorg/vivecraft/client_vr/ClientDataHolderVR;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/vivecraft/client_vr/ClientDataHolderVR", "currentPass", "Lorg/vivecraft/api/client/data/RenderPass;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/vivecraft/client_vr/render/helpers/RenderHelper", "applyVRModelView", "(Lorg/vivecraft/api/client/data/RenderPass;Lorg/joml/Matrix4f;)V", false);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitLineNumber(97, label8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/mojang/blaze3d/systems/RenderSystem", "applyModelViewMatrix", "()V", false);
Label label9 = new Label();
methodVisitor.visitLabel(label9);
methodVisitor.visitLineNumber(98, label9);
methodVisitor.visitInsn(RETURN);
Label label10 = new Label();
methodVisitor.visitLabel(label10);
methodVisitor.visitLocalVariable("modelViewStack", "Lorg/joml/Matrix4fStack;", null, label5, label10, 0);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "popStableGuiModelView", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(101, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/tom/vivecraftcompat/mixin/VREffectsHelperMixin", "stableGuiModelViewDepth", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFGT, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(102, label2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(104, label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "com/tom/vivecraftcompat/mixin/VREffectsHelperMixin", "stableGuiModelViewDepth", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/tom/vivecraftcompat/mixin/VREffectsHelperMixin", "stableGuiModelViewDepth", "I");
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(105, label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/mojang/blaze3d/systems/RenderSystem", "getModelViewStack", "()Lorg/joml/Matrix4fStack;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLineNumber(106, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joml/Matrix4fStack", "popMatrix", "()Lorg/joml/Matrix4fStack;", false);
methodVisitor.visitInsn(POP);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitLineNumber(107, label5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/mojang/blaze3d/systems/RenderSystem", "applyModelViewMatrix", "()V", false);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitLineNumber(108, label6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SableVRBridge", "popGuiVrTransformSuppression", "()V", false);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitLineNumber(109, label7);
methodVisitor.visitInsn(RETURN);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitLocalVariable("modelViewStack", "Lorg/joml/Matrix4fStack;", null, label4, label8, 0);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$renderHudLayers$0", "(FLcom/tom/vivecraftcompat/overlay/OverlayManager$Layer;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(75, label0);
methodVisitor.visitVarInsn(FLOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/tom/vivecraftcompat/overlay/OverlayManager$Layer", "getFramebuffer", "()Lcom/mojang/blaze3d/pipeline/RenderTarget;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/tom/vivecraftcompat/overlay/OverlayManager$Layer", "getPos", "()Lorg/joml/Vector3f;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/tom/vivecraftcompat/overlay/OverlayManager$Layer", "getRotation", "()Lorg/joml/Matrix4f;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/vivecraft/client_vr/render/helpers/VREffectsHelper", "render2D", "(FLcom/mojang/blaze3d/pipeline/RenderTarget;Lorg/joml/Vector3fc;Lorg/joml/Matrix4f;Z)V", false);
methodVisitor.visitInsn(RETURN);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLocalVariable("partialTicks", "F", null, label0, label1, 0);
methodVisitor.visitLocalVariable("l", "Lcom/tom/vivecraftcompat/overlay/OverlayManager$Layer;", null, label0, label1, 1);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
