package osrs;

import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   @Export("archive8")
   static Archive archive8;
   @ObfuscatedName("fq")
   @ObfuscatedGetter(
      longValue = 172020438683337197L
   )
   static long field3634;

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljs;Ljs;I)I",
      garbageValue = "119350129"
   )
   @Export("compare_bridged")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.age < var2.age ? -1 : (var2.age == var1.age ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(Ljv;IB)V",
      garbageValue = "26"
   )
   static void method5068(AbstractArchive var0, int var1) {
      if ((var1 & 536870912) != 0) {
         Fonts.logoSprite = EnumComposition.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", "");
      } else if ((var1 & 1073741824) != 0) {
         Fonts.logoSprite = EnumComposition.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", "");
      } else {
         Fonts.logoSprite = EnumComposition.SpriteBuffer_getIndexedSpriteByName(var0, "logo", "");
      }

   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-324437873"
   )
   static final int method5067(int var0, int var1) {
      int var2 = var1 * 57 + var0;
      var2 ^= var2 << 13;
      int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(ILcf;ZI)I",
      garbageValue = "918594995"
   )
   static int method5064(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? class13.scriptDotWidget : Interpreter.scriptActiveWidget;
      if (var0 == 1700) {
         Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.itemId;
         return 1;
      } else if (var0 == 1701) {
         if (var3.itemId != -1) {
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.itemQuantity;
         } else {
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == 1702) {
         Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.childIndex;
         return 1;
      } else {
         return 2;
      }
   }
}
