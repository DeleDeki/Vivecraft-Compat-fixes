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
public class CreateVehicleResolverDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(65, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/tom/vivecraftcompat/create/CreateVehicleResolver", null, "java/lang/Object", null);

classWriter.visitSource("CreateVehicleResolver.java", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_VOLATILE, "contraptionType", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_VOLATILE, "getVehicleMethod", "Ljava/lang/reflect/Method;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(8, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "find", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ReflectiveOperationException");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/IllegalArgumentException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "java/lang/ReflectiveOperationException");
methodVisitor.visitTryCatchBlock(label3, label4, label2, "java/lang/IllegalArgumentException");
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label5, label6, label2, "java/lang/ReflectiveOperationException");
methodVisitor.visitTryCatchBlock(label5, label6, label2, "java/lang/IllegalArgumentException");
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitLineNumber(11, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(13, label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "com/tom/vivecraftcompat/create/CreateVehicleResolver", "contraptionType", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ASTORE, 1);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitLineNumber(14, label8);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label9);
Label label10 = new Label();
methodVisitor.visitLabel(label10);
methodVisitor.visitLineNumber(15, label10);
methodVisitor.visitLdcInsn("com.simibubi.create.content.contraptions.AbstractContraptionEntity");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label11 = new Label();
methodVisitor.visitLabel(label11);
methodVisitor.visitLineNumber(16, label11);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/tom/vivecraftcompat/create/CreateVehicleResolver", "contraptionType", "Ljava/lang/Class;");
methodVisitor.visitLabel(label9);
methodVisitor.visitLineNumber(18, label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "com/tom/vivecraftcompat/create/CreateVehicleResolver", "getVehicleMethod", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(ASTORE, 2);
Label label12 = new Label();
methodVisitor.visitLabel(label12);
methodVisitor.visitLineNumber(19, label12);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label13);
Label label14 = new Label();
methodVisitor.visitLabel(label14);
methodVisitor.visitLineNumber(20, label14);
methodVisitor.visitLdcInsn("net.minecraft.world.entity.Entity");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitLdcInsn("getVehicle");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label15 = new Label();
methodVisitor.visitLabel(label15);
methodVisitor.visitLineNumber(21, label15);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/tom/vivecraftcompat/create/CreateVehicleResolver", "getVehicleMethod", "Ljava/lang/reflect/Method;");
methodVisitor.visitLabel(label13);
methodVisitor.visitLineNumber(23, label13);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/reflect/Method"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label16 = new Label();
methodVisitor.visitLabel(label16);
methodVisitor.visitLineNumber(26, label16);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label17 = new Label();
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitJumpInsn(IF_ICMPGE, label6);
Label label18 = new Label();
methodVisitor.visitLabel(label18);
methodVisitor.visitLineNumber(27, label18);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label19 = new Label();
methodVisitor.visitLabel(label19);
methodVisitor.visitLineNumber(28, label19);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(29, label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitLineNumber(26, label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label17);
methodVisitor.visitLabel(label6);
methodVisitor.visitLineNumber(33, label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"java/lang/Object"}, 0, new Object[] {});
Label label20 = new Label();
methodVisitor.visitJumpInsn(GOTO, label20);
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(31, label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label20);
methodVisitor.visitLineNumber(34, label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
