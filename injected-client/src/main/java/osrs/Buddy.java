package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("Buddy")
public class Buddy extends User {
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1693720149
   )
   @Export("world")
   public int world = -1;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1023710905
   )
   @Export("int2")
   public int int2;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -523203081
   )
   @Export("rank")
   public int rank;

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1819363744"
   )
   @Export("set")
   void set(int var1, int var2) {
      this.world = var1;
      this.int2 = var2;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1872799310"
   )
   @Export("getWorld")
   public int getWorld() {
      return this.world;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2092193613"
   )
   @Export("hasWorld")
   public boolean hasWorld() {
      return this.world > 0;
   }
}
