package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
public class class15 extends class14 {
   @ObfuscatedName("s")
   public static short[][] field137;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -49357127
   )
   static int field140;
   @ObfuscatedName("v")
   String field136;
   @ObfuscatedSignature(
      descriptor = "Lf;"
   )
   final class2 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lf;)V"
   )
   class15(class2 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lnd;I)V",
      garbageValue = "-1281352827"
   )
   void vmethod276(Buffer var1) {
      this.field136 = var1.readStringCp1252NullTerminated();
      var1.readInt();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ll;B)V",
      garbageValue = "29"
   )
   void vmethod281(ClanSettings var1) {
      var1.name = this.field136;
   }

   @ObfuscatedName("ff")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1672827396"
   )
   @Export("forceDisconnect")
   static final void forceDisconnect(int var0) {
      class7.logOut();
      switch(var0) {
      case 1:
         WorldMapLabelSize.method3218();
         break;
      case 2:
         class170.method3551();
      }

   }

   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-5074"
   )
   static void method196() {
      ReflectionCheck.method1126(class29.menuWidth / 2 + class14.menuX, class243.menuY);
   }

   @ObfuscatedName("ly")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "16"
   )
   static String method189(String var0) {
      PlayerType[] var1 = class372.PlayerType_values();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         PlayerType var3 = var1[var2];
         if (var3.modIcon != -1 && var0.startsWith(SecureRandomFuture.method1982(var3.modIcon))) {
            var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
            break;
         }
      }

      return var0;
   }
}
