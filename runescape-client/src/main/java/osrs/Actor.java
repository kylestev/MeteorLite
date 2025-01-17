package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("Actor")
public abstract class Actor extends Renderable {
   @ObfuscatedName("ht")
   @ObfuscatedGetter(
      intValue = 1224542185
   )
   static int field1146;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1060488561
   )
   @Export("x")
   int x;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1758566435
   )
   @Export("y")
   int y;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -780864819
   )
   @Export("rotation")
   int rotation;
   @ObfuscatedName("as")
   @Export("isWalking")
   boolean isWalking = false;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1850945247
   )
   int field1087 = 1;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1010787109
   )
   @Export("playerCycle")
   int playerCycle;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1162942381
   )
   @Export("idleSequence")
   int idleSequence = -1;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -976729951
   )
   @Export("turnLeftSequence")
   int turnLeftSequence = -1;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1205631887
   )
   @Export("turnRightSequence")
   int turnRightSequence = -1;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1698656563
   )
   @Export("walkSequence")
   int walkSequence = -1;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1827265149
   )
   @Export("walkBackSequence")
   int walkBackSequence = -1;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -862066401
   )
   @Export("walkLeftSequence")
   int walkLeftSequence = -1;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -680764833
   )
   @Export("walkRightSequence")
   int walkRightSequence = -1;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 528537939
   )
   @Export("runSequence")
   int runSequence = -1;
   @ObfuscatedName("ap")
   @Export("overheadText")
   String overheadText = null;
   @ObfuscatedName("au")
   @Export("isAutoChatting")
   boolean isAutoChatting;
   @ObfuscatedName("aj")
   boolean field1099 = false;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1349162329
   )
   @Export("overheadTextCyclesRemaining")
   int overheadTextCyclesRemaining = 100;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -485598179
   )
   @Export("overheadTextColor")
   int overheadTextColor = 0;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1527060029
   )
   @Export("overheadTextEffect")
   int overheadTextEffect = 0;
   @ObfuscatedName("ay")
   @Export("hitSplatCount")
   byte hitSplatCount = 0;
   @ObfuscatedName("bg")
   @Export("hitSplatTypes")
   int[] hitSplatTypes = new int[4];
   @ObfuscatedName("bl")
   @Export("hitSplatValues")
   int[] hitSplatValues = new int[4];
   @ObfuscatedName("bx")
   @Export("hitSplatCycles")
   int[] hitSplatCycles = new int[4];
   @ObfuscatedName("bd")
   @Export("hitSplatTypes2")
   int[] hitSplatTypes2 = new int[4];
   @ObfuscatedName("bt")
   @Export("hitSplatValues2")
   int[] hitSplatValues2 = new int[4];
   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "Lkf;"
   )
   @Export("healthBars")
   IterableNodeDeque healthBars = new IterableNodeDeque();
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = -1726125141
   )
   @Export("targetIndex")
   int targetIndex = -1;
   @ObfuscatedName("bh")
   @Export("false0")
   boolean false0 = false;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -1484671141
   )
   int field1112 = -1;
   @ObfuscatedName("bm")
   boolean field1127;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 1478500765
   )
   @Export("movementSequence")
   int movementSequence = -1;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = 1354844887
   )
   @Export("movementFrame")
   int movementFrame = 0;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 909600967
   )
   @Export("movementFrameCycle")
   int movementFrameCycle = 0;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -153672255
   )
   @Export("sequence")
   int sequence = -1;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = 688727445
   )
   @Export("sequenceFrame")
   int sequenceFrame = 0;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -701592673
   )
   @Export("sequenceFrameCycle")
   int sequenceFrameCycle = 0;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = 1424121639
   )
   @Export("sequenceDelay")
   int sequenceDelay = 0;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -1810491641
   )
   int field1116 = 0;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -1442456691
   )
   @Export("spotAnimation")
   int spotAnimation = -1;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = 1112868275
   )
   @Export("spotAnimationFrame")
   int spotAnimationFrame = 0;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = 914687343
   )
   @Export("spotAnimationFrameCycle")
   int spotAnimationFrameCycle = 0;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -577715243
   )
   int field1125;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = 539982077
   )
   int field1126;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = -222009755
   )
   int field1083;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = 964367307
   )
   int field1128;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 646319749
   )
   int field1100;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      intValue = 154596387
   )
   int field1130;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = -1879657163
   )
   int field1131;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = -438636187
   )
   int field1132;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = 1091823721
   )
   int field1133;
   @ObfuscatedName("cx")
   @ObfuscatedGetter(
      intValue = -685467991
   )
   @Export("npcCycle")
   int npcCycle = 0;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = -1735337961
   )
   @Export("defaultHeight")
   int defaultHeight = 200;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = 1488414823
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = -2044798983
   )
   int field1137 = 0;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = 369982221
   )
   int field1138 = 32;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = 274803431
   )
   @Export("pathLength")
   int pathLength = 0;
   @ObfuscatedName("cs")
   @Export("pathX")
   int[] pathX = new int[10];
   @ObfuscatedName("ce")
   @Export("pathY")
   int[] pathY = new int[10];
   @ObfuscatedName("cp")
   @Export("pathTraversed")
   byte[] pathTraversed = new byte[10];
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = -405619359
   )
   int field1085 = 0;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = 910802769
   )
   int field1144 = 0;
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = -947188393
   )
   int field1145 = -1;

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-532391824"
   )
   @Export("isVisible")
   boolean isVisible() {
      return false;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "64"
   )
   final void method2165() {
      this.pathLength = 0;
      this.field1144 = 0;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIB)V",
      garbageValue = "32"
   )
   @Export("addHitSplat")
   final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         if (this.hitSplatCycles[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      var9 = -1;
      int var10 = -1;
      int var11 = 0;
      if (var1 >= 0) {
         HitSplatDefinition var12 = Canvas.method372(var1);
         var10 = var12.field1816;
         var11 = var12.field1805;
      }

      int var14;
      if (var8) {
         if (var10 == -1) {
            return;
         }

         var9 = 0;
         var14 = 0;
         if (var10 == 0) {
            var14 = this.hitSplatCycles[0];
         } else if (var10 == 1) {
            var14 = this.hitSplatValues[0];
         }

         for(int var13 = 1; var13 < 4; ++var13) {
            if (var10 == 0) {
               if (this.hitSplatCycles[var13] < var14) {
                  var9 = var13;
                  var14 = this.hitSplatCycles[var13];
               }
            } else if (var10 == 1 && this.hitSplatValues[var13] < var14) {
               var9 = var13;
               var14 = this.hitSplatValues[var13];
            }
         }

         if (var10 == 1 && var14 >= var2) {
            return;
         }
      } else {
         if (var7) {
            this.hitSplatCount = 0;
         }

         for(var14 = 0; var14 < 4; ++var14) {
            byte var15 = this.hitSplatCount;
            this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
            if (this.hitSplatCycles[var15] <= var5) {
               var9 = var15;
               break;
            }
         }
      }

      if (var9 >= 0) {
         this.hitSplatTypes[var9] = var1;
         this.hitSplatValues[var9] = var2;
         this.hitSplatTypes2[var9] = var3;
         this.hitSplatValues2[var9] = var4;
         this.hitSplatCycles[var9] = var5 + var11 + var6;
      }
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)V",
      garbageValue = "-2125214461"
   )
   @Export("addHealthBar")
   final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
      HealthBarDefinition var7 = ObjectSound.method1772(var1);
      HealthBar var8 = null;
      HealthBar var9 = null;
      int var10 = var7.int2;
      int var11 = 0;

      HealthBar var12;
      for(var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) {
         ++var11;
         if (var12.definition.field1668 == var7.field1668) {
            var12.put(var2 + var4, var5, var6, var3);
            return;
         }

         if (var12.definition.int1 <= var7.int1) {
            var8 = var12;
         }

         if (var12.definition.int2 > var10) {
            var9 = var12;
            var10 = var12.definition.int2;
         }
      }

      if (var9 != null || var11 < 4) {
         var12 = new HealthBar(var7);
         if (var8 == null) {
            this.healthBars.addLast(var12);
         } else {
            IterableNodeDeque.IterableNodeDeque_addBefore(var12, var8);
         }

         var12.put(var2 + var4, var5, var6, var3);
         if (var11 >= 4) {
            var9.remove();
         }

      }
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1759022108"
   )
   @Export("removeHealthBar")
   final void removeHealthBar(int var1) {
      HealthBarDefinition var2 = ObjectSound.method1772(var1);

      for(HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) {
         if (var2 == var3.definition) {
            var3.remove();
            return;
         }
      }

   }
}
