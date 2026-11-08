// Generated reconstruction of the v3.4.3 class file using Java 21 ASMifier.
// This is low-level Java ASM source, NOT the original authored source.
// Part of a verified JVM bytecode preservation layer.
package asm.com.tom.vivecraftcompat.create;
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
public class CreateSchematicVRInputBridge$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(65, ACC_SUPER, "com/tom/vivecraftcompat/create/CreateSchematicVRInputBridge$1", null, "java/lang/Object", new String[] { "org/vivecraft/client_vr/provider/openvr_lwjgl/VRInputAction$KeyListener" });

classWriter.visitSource("CreateSchematicVRInputBridge.java", null);

classWriter.visitNestHost("com/tom/vivecraftcompat/create/CreateSchematicVRInputBridge");

classWriter.visitOuterClass("com/tom/vivecraftcompat/create/CreateSchematicVRInputBridge", "registerAttackListener", "(Lnet/minecraft/client/KeyMapping;)V");

classWriter.visitInnerClass("com/tom/vivecraftcompat/create/CreateSchematicVRInputBridge$1", null, null, 0);

classWriter.visitInnerClass("org/vivecraft/client_vr/provider/openvr_lwjgl/VRInputAction$KeyListener", "org/vivecraft/client_vr/provider/openvr_lwjgl/VRInputAction", "KeyListener", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(82, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/create/CreateSchematicVRInputBridge$1;", null, label0, label1, 0);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onUnpressed", "(Lorg/vivecraft/client_vr/provider/ControllerType;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(85, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/tom/vivecraftcompat/create/CreateSchematicVRInputBridge", "attackButtonHeld", "Z");
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(86, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/create/CreateSchematicVRInputBridge$1;", null, label0, label2, 0);
methodVisitor.visitLocalVariable("controller", "Lorg/vivecraft/client_vr/provider/ControllerType;", null, label0, label2, 1);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onPressed", "(Lorg/vivecraft/client_vr/provider/ControllerType;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(91, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/tom/vivecraftcompat/create/CreateSchematicVRInputBridge", "attackButtonHeld", "Z");
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(92, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/create/CreateSchematicVRInputBridge$1;", null, label0, label2, 0);
methodVisitor.visitLocalVariable("controller", "Lorg/vivecraft/client_vr/provider/ControllerType;", null, label0, label2, 1);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPriority", "()I", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(97, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/create/CreateSchematicVRInputBridge$1;", null, label0, label1, 0);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
