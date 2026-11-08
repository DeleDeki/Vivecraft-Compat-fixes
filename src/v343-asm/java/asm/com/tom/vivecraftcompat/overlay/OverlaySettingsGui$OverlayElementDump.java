// Generated reconstruction of the v3.4.3 class file using Java 21 ASMifier.
// This is low-level Java ASM source, NOT the original authored source.
// Part of a verified JVM bytecode preservation layer.
package asm.com.tom.vivecraftcompat.overlay;
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
public class OverlaySettingsGui$OverlayElementDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(65, ACC_PUBLIC | ACC_SUPER, "com/tom/vivecraftcompat/overlay/OverlaySettingsGui$OverlayElement", null, "java/lang/Object", null);

classWriter.visitSource("OverlaySettingsGui.java", null);

classWriter.visitNestHost("com/tom/vivecraftcompat/overlay/OverlaySettingsGui");

classWriter.visitInnerClass("com/tom/vivecraftcompat/overlay/OverlaySettingsGui$OverlayElement", "com/tom/vivecraftcompat/overlay/OverlaySettingsGui", "OverlayElement", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "overlay", "Lcom/tom/vivecraftcompat/overlay/HudOverlayScreen;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/tom/vivecraftcompat/overlay/OverlaySettingsGui;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/tom/vivecraftcompat/overlay/OverlaySettingsGui;Lcom/tom/vivecraftcompat/overlay/HudOverlayScreen;)V", null, null);
methodVisitor.visitParameter(null, ACC_FINAL | ACC_MANDATED);
methodVisitor.visitParameter(null, 0);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(529, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/tom/vivecraftcompat/overlay/OverlaySettingsGui$OverlayElement", "this$0", "Lcom/tom/vivecraftcompat/overlay/OverlaySettingsGui;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(530, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/tom/vivecraftcompat/overlay/OverlaySettingsGui$OverlayElement", "overlay", "Lcom/tom/vivecraftcompat/overlay/HudOverlayScreen;");
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(531, label2);
methodVisitor.visitInsn(RETURN);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/overlay/OverlaySettingsGui$OverlayElement;", null, label0, label3, 0);
methodVisitor.visitLocalVariable("this$0", "Lcom/tom/vivecraftcompat/overlay/OverlaySettingsGui;", null, label0, label3, 1);
methodVisitor.visitLocalVariable("overlay", "Lcom/tom/vivecraftcompat/overlay/HudOverlayScreen;", null, label0, label3, 2);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(535, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/overlay/OverlaySettingsGui$OverlayElement", "overlay", "Lcom/tom/vivecraftcompat/overlay/HudOverlayScreen;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/overlay/OverlaySettingsGui$OverlayElement", "this$0", "Lcom/tom/vivecraftcompat/overlay/OverlaySettingsGui;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/overlay/OverlaySettingsGui", "access$000", "(Lcom/tom/vivecraftcompat/overlay/OverlaySettingsGui;)Lcom/tom/cpl/gui/IGui;", false);
methodVisitor.visitLdcInsn("vivecraftcompat.gui.overlay.create");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/tom/cpl/gui/IGui", "i18nFormat", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/tom/vivecraftcompat/overlay/OverlaySettingsGui$OverlayElement", "overlay", "Lcom/tom/vivecraftcompat/overlay/HudOverlayScreen;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/tom/vivecraftcompat/overlay/HudOverlayScreen", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitInsn(ARETURN);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/overlay/OverlaySettingsGui$OverlayElement;", null, label0, label3, 0);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
