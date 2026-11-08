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
public class SimulatedGameRendererMixinDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(65, ACC_PUBLIC | ACC_SUPER, "com/tom/vivecraftcompat/mixin/compat/simulated/SimulatedGameRendererMixin", null, "java/lang/Object", null);

classWriter.visitSource("SimulatedGameRendererMixin.java", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/spongepowered/asm/mixin/Mixin;", false);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visit(null, Type.getType("Lnet/minecraft/client/renderer/GameRenderer;"));
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("net/minecraft/world/phys/HitResult$Type", "net/minecraft/world/phys/HitResult", "Type", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "minecraft", "Lnet/minecraft/client/Minecraft;", null, null);
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
methodVisitor.visitLineNumber(18, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/compat/simulated/SimulatedGameRendererMixin;", null, label0, label1, 0);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "vivecraftcompat$pickFromVRHand", "(FLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/spongepowered/asm/mixin/injection/Inject;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("method");
annotationVisitor1.visit(null, "pick(F)V");
annotationVisitor1.visitEnd();
}
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("at");
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Lorg/spongepowered/asm/mixin/injection/At;");
annotationVisitor2.visit("value", "TAIL");
annotationVisitor2.visitEnd();
}
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(25, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/VRMode", "isVRHandAiming", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/mixin/compat/simulated/SimulatedGameRendererMixin", "minecraft", "Lnet/minecraft/client/Minecraft;");
methodVisitor.visitFieldInsn(GETFIELD, "net/minecraft/client/Minecraft", "player", "Lnet/minecraft/client/player/LocalPlayer;");
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/mixin/compat/simulated/SimulatedGameRendererMixin", "minecraft", "Lnet/minecraft/client/Minecraft;");
methodVisitor.visitFieldInsn(GETFIELD, "net/minecraft/client/Minecraft", "level", "Lnet/minecraft/client/multiplayer/ClientLevel;");
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/mixin/compat/simulated/SimulatedGameRendererMixin", "minecraft", "Lnet/minecraft/client/Minecraft;");
methodVisitor.visitFieldInsn(GETFIELD, "net/minecraft/client/Minecraft", "screen", "Lnet/minecraft/client/gui/screens/Screen;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(27, label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(29, label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/mixin/compat/simulated/SimulatedGameRendererMixin", "minecraft", "Lnet/minecraft/client/Minecraft;");
methodVisitor.visitFieldInsn(GETFIELD, "net/minecraft/client/Minecraft", "player", "Lnet/minecraft/client/player/LocalPlayer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/mixin/compat/simulated/SimulatedGameRendererMixin", "minecraft", "Lnet/minecraft/client/Minecraft;");
methodVisitor.visitFieldInsn(GETFIELD, "net/minecraft/client/Minecraft", "player", "Lnet/minecraft/client/player/LocalPlayer;");
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(30, label3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/client/player/LocalPlayer", "blockInteractionRange", "()D", false);
methodVisitor.visitVarInsn(FLOAD, 1);
methodVisitor.visitInsn(ICONST_0);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLineNumber(29, label4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge", "pickFromRightHand", "(Lnet/minecraft/world/entity/player/Player;DFZ)Lnet/minecraft/world/phys/HitResult;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitLineNumber(31, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/world/phys/HitResult", "getType", "()Lnet/minecraft/world/phys/HitResult$Type;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "net/minecraft/world/phys/HitResult$Type", "MISS", "Lnet/minecraft/world/phys/HitResult$Type;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitLineNumber(32, label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"net/minecraft/world/phys/HitResult"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitLineNumber(34, label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/mixin/compat/simulated/SimulatedGameRendererMixin", "minecraft", "Lnet/minecraft/client/Minecraft;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "net/minecraft/client/Minecraft", "hitResult", "Lnet/minecraft/world/phys/HitResult;");
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitLineNumber(35, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/mixin/compat/simulated/SimulatedGameRendererMixin", "minecraft", "Lnet/minecraft/client/Minecraft;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "net/minecraft/client/Minecraft", "crosshairPickEntity", "Lnet/minecraft/world/entity/Entity;");
Label label9 = new Label();
methodVisitor.visitLabel(label9);
methodVisitor.visitLineNumber(36, label9);
methodVisitor.visitInsn(RETURN);
Label label10 = new Label();
methodVisitor.visitLabel(label10);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/mixin/compat/simulated/SimulatedGameRendererMixin;", null, label0, label10, 0);
methodVisitor.visitLocalVariable("partialTicks", "F", null, label0, label10, 1);
methodVisitor.visitLocalVariable("ci", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;", null, label0, label10, 2);
methodVisitor.visitLocalVariable("hit", "Lnet/minecraft/world/phys/HitResult;", null, label5, label10, 3);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
