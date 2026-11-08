// Generated reconstruction of the v3.4.3 class file using Java 21 ASMifier.
// This is low-level Java ASM source, NOT the original authored source.
// Part of a verified JVM bytecode preservation layer.
package asm.com.tom.vivecraftcompat;
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
public class ClientDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(65, ACC_PUBLIC | ACC_SUPER, "com/tom/vivecraftcompat/Client", null, "java/lang/Object", null);

classWriter.visitSource("Client.java", null);

classWriter.visitInnerClass("net/neoforged/neoforge/client/event/ScreenEvent$Init", "net/neoforged/neoforge/client/event/ScreenEvent", "Init", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("net/neoforged/neoforge/client/event/ScreenEvent$Init$Post", "net/neoforged/neoforge/client/event/ScreenEvent$Init", "Post", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("net/minecraft/client/gui/components/Button$OnPress", "net/minecraft/client/gui/components/Button", "OnPress", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("net/minecraft/client/gui/components/Button$Builder", "net/minecraft/client/gui/components/Button", "Builder", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/tom/vivecraftcompat/overlay/OverlayManager$Layer", "com/tom/vivecraftcompat/overlay/OverlayManager", "Layer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "config", "Lcom/tom/cpl/config/ModConfigFile;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CAM_BTN", "Lnet/minecraft/network/chat/Component;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "OVERLAY_BTN", "Lnet/minecraft/network/chat/Component;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(31, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLocalVariable("this", "Lcom/tom/vivecraftcompat/Client;", null, label0, label1, 0);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "init", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(37, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "net/neoforged/neoforge/common/NeoForge", "EVENT_BUS", "Lnet/neoforged/bus/api/IEventBus;");
methodVisitor.visitLdcInsn(Type.getType("Lcom/tom/vivecraftcompat/overlay/OverlayManager;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "net/neoforged/bus/api/IEventBus", "register", "(Ljava/lang/Object;)V", true);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(38, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "net/neoforged/neoforge/common/NeoForge", "EVENT_BUS", "Lnet/neoforged/bus/api/IEventBus;");
methodVisitor.visitLdcInsn(Type.getType("Lcom/tom/vivecraftcompat/Client;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "net/neoforged/bus/api/IEventBus", "register", "(Ljava/lang/Object;)V", true);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(40, label2);
methodVisitor.visitTypeInsn(NEW, "com/tom/cpl/config/ModConfigFile");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/io/File");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "net/neoforged/fml/loading/FMLPaths", "CONFIGDIR", "Lnet/neoforged/fml/loading/FMLPaths;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/neoforged/fml/loading/FMLPaths", "get", "()Ljava/nio/file/Path;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/nio/file/Path", "toFile", "()Ljava/io/File;", true);
methodVisitor.visitLdcInsn("vivecraftcompat.json");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/File", "<init>", "(Ljava/io/File;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/tom/cpl/config/ModConfigFile", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/tom/vivecraftcompat/Client", "config", "Lcom/tom/cpl/config/ModConfigFile;");
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(41, label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/overlay/OverlayConfig", "loadOverlays", "()V", false);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLineNumber(42, label4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/create/CreateSeatVRBridge", "init", "()V", false);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitLineNumber(43, label5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/create/CreateSchematicVRInputBridge", "init", "()V", false);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitLineNumber(44, label6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SableVRBridge", "init", "()V", false);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitLineNumber(45, label7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge", "init", "()V", false);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitLineNumber(46, label8);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "initGui", "(Lnet/neoforged/neoforge/client/event/ScreenEvent$Init$Post;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lnet/neoforged/bus/api/SubscribeEvent;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(50, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/VRMode", "isVR", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/neoforged/neoforge/client/event/ScreenEvent$Init$Post", "getScreen", "()Lnet/minecraft/client/gui/screens/Screen;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "net/minecraft/client/gui/screens/PauseScreen");
methodVisitor.visitJumpInsn(IFEQ, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(51, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/neoforged/neoforge/client/event/ScreenEvent$Init$Post", "getListenersList", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "net/minecraft/client/gui/components/events/GuiEventListener");
methodVisitor.visitVarInsn(ASTORE, 2);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLineNumber(52, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "net/minecraft/client/gui/components/Button");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "net/minecraft/client/gui/components/Button");
methodVisitor.visitVarInsn(ASTORE, 3);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitLineNumber(53, label6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/client/gui/components/Button", "getMessage", "()Lnet/minecraft/network/chat/Component;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "com/tom/vivecraftcompat/Client", "CAM_BTN", "Lnet/minecraft/network/chat/Component;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "net/minecraft/network/chat/Component", "equals", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label5);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitLineNumber(54, label7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/tom/vivecraftcompat/Client", "OVERLAY_BTN", "Lnet/minecraft/network/chat/Component;");
methodVisitor.visitInvokeDynamicInsn("onPress", "()Lnet/minecraft/client/gui/components/Button$OnPress;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Lnet/minecraft/client/gui/components/Button;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/tom/vivecraftcompat/Client", "lambda$initGui$1", "(Lnet/minecraft/client/gui/components/Button;)V", false), Type.getType("(Lnet/minecraft/client/gui/components/Button;)V")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/minecraft/client/gui/components/Button", "builder", "(Lnet/minecraft/network/chat/Component;Lnet/minecraft/client/gui/components/Button$OnPress;)Lnet/minecraft/client/gui/components/Button$Builder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitLineNumber(59, label8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/client/gui/components/Button", "getX", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/client/gui/components/Button", "getWidth", "()I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/client/gui/components/Button", "getY", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/client/gui/components/Button$Builder", "bounds", "(IIII)Lnet/minecraft/client/gui/components/Button$Builder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/client/gui/components/Button$Builder", "build", "()Lnet/minecraft/client/gui/components/Button;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label9 = new Label();
methodVisitor.visitLabel(label9);
methodVisitor.visitLineNumber(60, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/neoforged/neoforge/client/event/ScreenEvent$Init$Post", "addListener", "(Lnet/minecraft/client/gui/components/events/GuiEventListener;)V", false);
Label label10 = new Label();
methodVisitor.visitLabel(label10);
methodVisitor.visitLineNumber(61, label10);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label5);
methodVisitor.visitLineNumber(64, label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(66, label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
Label label11 = new Label();
methodVisitor.visitLabel(label11);
methodVisitor.visitLocalVariable("b", "Lnet/minecraft/client/gui/components/Button;", null, label6, label5, 3);
methodVisitor.visitLocalVariable("l", "Lnet/minecraft/client/gui/components/events/GuiEventListener;", null, label4, label5, 2);
methodVisitor.visitLocalVariable("evt", "Lnet/neoforged/neoforge/client/event/ScreenEvent$Init$Post;", null, label0, label11, 0);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "preInit", "(Lnet/neoforged/bus/api/IEventBus;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(69, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("accept", "()Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "com/tom/vivecraftcompat/Client", "registerOverlays", "(Lnet/neoforged/neoforge/client/event/RegisterGuiLayersEvent;)V", false), Type.getType("(Lnet/neoforged/neoforge/client/event/RegisterGuiLayersEvent;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "net/neoforged/bus/api/IEventBus", "addListener", "(Ljava/util/function/Consumer;)V", true);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(70, label1);
methodVisitor.visitInsn(RETURN);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLocalVariable("bus", "Lnet/neoforged/bus/api/IEventBus;", null, label0, label2, 0);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "registerOverlays", "(Lnet/neoforged/neoforge/client/event/RegisterGuiLayersEvent;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(73, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/neoforged/fml/ModList", "get", "()Lnet/neoforged/fml/ModList;", false);
methodVisitor.visitLdcInsn("jade");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/neoforged/fml/ModList", "isLoaded", "(Ljava/lang/String;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/JadeOverlay", "register", "(Lnet/neoforged/neoforge/client/event/RegisterGuiLayersEvent;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(74, label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/neoforged/fml/ModList", "get", "()Lnet/neoforged/fml/ModList;", false);
methodVisitor.visitLdcInsn("journeymap");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/neoforged/fml/ModList", "isLoaded", "(Ljava/lang/String;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/JourneyMapOverlay", "register", "(Lnet/neoforged/neoforge/client/event/RegisterGuiLayersEvent;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(75, label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/neoforged/fml/ModList", "get", "()Lnet/neoforged/fml/ModList;", false);
methodVisitor.visitLdcInsn("theoneprobe");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/neoforged/fml/ModList", "isLoaded", "(Ljava/lang/String;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/TOPOverlay", "register", "(Lnet/neoforged/neoforge/client/event/RegisterGuiLayersEvent;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(76, label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLocalVariable("event", "Lnet/neoforged/neoforge/client/event/RegisterGuiLayersEvent;", null, label0, label4, 0);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$initGui$1", "(Lnet/minecraft/client/gui/components/Button;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(55, label0);
methodVisitor.visitTypeInsn(NEW, "com/tom/vivecraftcompat/overlay/OverlayManager$Layer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "com/tom/vivecraftcompat/Client", "lambda$initGui$0", "(Lcom/tom/vivecraftcompat/overlay/OverlayManager$Layer;)Lnet/minecraft/client/gui/screens/Screen;", false), Type.getType("(Lcom/tom/vivecraftcompat/overlay/OverlayManager$Layer;)Lnet/minecraft/client/gui/screens/Screen;")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/tom/vivecraftcompat/overlay/OverlayManager$Layer", "<init>", "(Ljava/util/function/Function;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(56, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/vivecraft/client_vr/provider/ControllerType", "RIGHT", "Lorg/vivecraft/client_vr/provider/ControllerType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/tom/vivecraftcompat/overlay/OverlayManager$Layer", "spawnOverlay", "(Lorg/vivecraft/client_vr/provider/ControllerType;)V", false);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(57, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/tom/vivecraftcompat/overlay/OverlayManager", "addLayer", "(Lcom/tom/vivecraftcompat/overlay/OverlayManager$Layer;)V", false);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(58, label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/minecraft/client/Minecraft", "getInstance", "()Lnet/minecraft/client/Minecraft;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/client/Minecraft", "setScreen", "(Lnet/minecraft/client/gui/screens/Screen;)V", false);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLineNumber(59, label4);
methodVisitor.visitInsn(RETURN);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitLocalVariable("__", "Lnet/minecraft/client/gui/components/Button;", null, label0, label5, 0);
methodVisitor.visitLocalVariable("layer", "Lcom/tom/vivecraftcompat/overlay/OverlayManager$Layer;", null, label1, label5, 1);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$initGui$0", "(Lcom/tom/vivecraftcompat/overlay/OverlayManager$Layer;)Lnet/minecraft/client/gui/screens/Screen;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(55, label0);
methodVisitor.visitTypeInsn(NEW, "com/tom/vivecraftcompat/overlay/FloatingGui");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_NEWINVOKESPECIAL, "com/tom/vivecraftcompat/overlay/OverlaySettingsGui", "<init>", "(Lcom/tom/cpl/gui/IGui;)V", false), Type.getType("(Lcom/tom/cpl/gui/IGui;)Lcom/tom/cpl/gui/Frame;")});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/tom/vivecraftcompat/overlay/FloatingGui", "<init>", "(Ljava/util/function/Function;Lcom/tom/vivecraftcompat/overlay/OverlayManager$Layer;)V", false);
methodVisitor.visitInsn(ARETURN);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLocalVariable("i", "Lcom/tom/vivecraftcompat/overlay/OverlayManager$Layer;", null, label0, label1, 0);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(33, label0);
methodVisitor.visitLdcInsn("vivecraft.gui.screenshot");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/minecraft/network/chat/Component", "translatable", "(Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;", true);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/tom/vivecraftcompat/Client", "CAM_BTN", "Lnet/minecraft/network/chat/Component;");
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(34, label1);
methodVisitor.visitLdcInsn("vivecraftcompat.gui.overlays");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/minecraft/network/chat/Component", "translatable", "(Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;", true);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/tom/vivecraftcompat/Client", "OVERLAY_BTN", "Lnet/minecraft/network/chat/Component;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
