package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("JagexCache")
public class JagexCache {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lnf;"
   )
   @Export("JagexCache_randomDat")
   public static BufferedFile JagexCache_randomDat = null;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Lnf;"
   )
   @Export("JagexCache_dat2File")
   public static BufferedFile JagexCache_dat2File = null;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lnf;"
   )
   @Export("JagexCache_idx255File")
   public static BufferedFile JagexCache_idx255File = null;

   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lio;B)Ljava/lang/String;",
      garbageValue = "109"
   )
   static String method2540(String var0, Widget var1) {
      if (var0.indexOf("%") != -1) {
         for(int var2 = 1; var2 <= 5; ++var2) {
            while(true) {
               int var3 = var0.indexOf("%" + var2);
               if (var3 == -1) {
                  break;
               }

               String var4 = var0.substring(0, var3);
               int var5 = ModeWhere.method5160(var1, var2 - 1);
               String var6;
               if (var5 < 999999999) {
                  var6 = Integer.toString(var5);
               } else {
                  var6 = "*";
               }

               var0 = var4 + var6 + var0.substring(var3 + 2);
            }
         }
      }

      return var0;
   }
}
