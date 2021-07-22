import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("Huffman")
public class Huffman {

  @ObfuscatedName("br")
  @ObfuscatedSignature(
      descriptor = "[Lof;"
  )
  @Export("worldSelectStars")
  static IndexedSprite[] worldSelectStars;
  @ObfuscatedName("f")
  @Export("masks")
  int[] masks;
  @ObfuscatedName("e")
  @Export("bits")
  byte[] bits;
  @ObfuscatedName("v")
  @Export("keys")
  int[] keys;

  public Huffman(byte[] var1) {
    int var2 = var1.length; // L: 9
    this.masks = new int[var2]; // L: 10
    this.bits = var1; // L: 11
    int[] var3 = new int[33]; // L: 12
    this.keys = new int[8]; // L: 13
    int var4 = 0; // L: 14

    for (int var5 = 0; var5 < var2; ++var5) { // L: 15
      byte var6 = var1[var5]; // L: 16
      if (var6 != 0) { // L: 17
        int var7 = 1 << 32 - var6; // L: 18
        int var8 = var3[var6]; // L: 19
        this.masks[var5] = var8; // L: 20
        int var9;
        int var10;
        int var11;
        int var12;
        if ((var8 & var7) != 0) { // L: 22
          var9 = var3[var6 - 1];
        } else {
          var9 = var8 | var7; // L: 24

          for (var10 = var6 - 1; var10 >= 1; --var10) { // L: 25
            var11 = var3[var10]; // L: 26
            if (var11 != var8) { // L: 27
              break;
            }

            var12 = 1 << 32 - var10; // L: 28
            if ((var11 & var12) != 0) { // L: 29
              var3[var10] = var3[var10 - 1]; // L: 30
              break;
            }

            var3[var10] = var11 | var12; // L: 33
          }
        }

        var3[var6] = var9; // L: 38

        for (var10 = var6 + 1; var10 <= 32; ++var10) { // L: 39
          if (var8 == var3[var10]) { // L: 40
            var3[var10] = var9;
          }
        }

        var10 = 0; // L: 42

        for (var11 = 0; var11 < var6; ++var11) { // L: 43
          var12 = Integer.MIN_VALUE >>> var11; // L: 44
          if ((var8 & var12) != 0) { // L: 45
            if (this.keys[var10] == 0) { // L: 46
              this.keys[var10] = var4;
            }

            var10 = this.keys[var10]; // L: 47
          } else {
            ++var10; // L: 49
          }

          if (var10 >= this.keys.length) { // L: 50
            int[] var13 = new int[this.keys.length * 2]; // L: 51

            for (int var14 = 0; var14 < this.keys.length; ++var14) { // L: 52
              var13[var14] = this.keys[var14];
            }

            this.keys = var13; // L: 53
          }

          var12 >>>= 1; // L: 55
        }

        this.keys[var10] = ~var5; // L: 57
        if (var10 >= var4) { // L: 58
          var4 = var10 + 1;
        }
      }
    }

  } // L: 60

  @ObfuscatedName("v")
  @ObfuscatedSignature(
      descriptor = "(Lnt;IIIIIII)V",
      garbageValue = "1430130968"
  )
  @Export("loadTerrain")
  static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5,
      int var6) {
    int var7;
    if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 81
      Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 82

      while (true) {
        var7 = var0.readUnsignedByte(); // L: 84
        if (var7 == 0) { // L: 85
          if (var1 == 0) { // L: 86
            int[] var14 = Tiles.Tiles_heights[0][var2]; // L: 87
            int var11 = var2 + var4 + 932731; // L: 90
            int var12 = var3 + var5 + 556238; // L: 91
            int var13 = AttackOption.method2382(var11 + 45365, var12 + 91923, 4) - 128 + (
                AttackOption.method2382(var11 + 10294, 37821 + var12, 2) - 128 >> 1) + (
                AttackOption.method2382(var11, var12, 1) - 128 >> 2); // L: 93
            var13 = (int) (0.3D * (double) var13) + 35; // L: 94
            if (var13 < 10) { // L: 95
              var13 = 10;
            } else if (var13 > 60) { // L: 96
              var13 = 60;
            }

            var14[var3] = -var13 * 8; // L: 99
          } else {
            Tiles.Tiles_heights[var1][var2][var3] =
                Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 101
          }
          break;
        }

        if (var7 == 1) { // L: 104
          int var8 = var0.readUnsignedByte(); // L: 105
          if (var8 == 1) { // L: 106
            var8 = 0;
          }

          if (var1 == 0) { // L: 107
            Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
          } else {
            Tiles.Tiles_heights[var1][var2][var3] =
                Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 108
          }
          break;
        }

        if (var7 <= 49) { // L: 111
          Tiles.field1111[var1][var2][var3] = var0.readByte(); // L: 112
          class22.field186[var1][var2][var3] = (byte) ((var7 - 2) / 4); // L: 113
          class16.field132[var1][var2][var3] = (byte) (var7 - 2 + var6 & 3); // L: 114
        } else if (var7 <= 81) { // L: 117
          Tiles.Tiles_renderFlags[var1][var2][var3] = (byte) (var7 - 49); // L: 118
        } else {
          AccessFile.field4098[var1][var2][var3] = (byte) (var7 - 81); // L: 121
        }
      }
    } else {
      while (true) {
        var7 = var0.readUnsignedByte(); // L: 126
        if (var7 == 0) { // L: 127
          break;
        }

        if (var7 == 1) { // L: 128
          var0.readUnsignedByte(); // L: 129
          break;
        }

        if (var7 <= 49) { // L: 132
          var0.readUnsignedByte();
        }
      }
    }

  } // L: 135

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      descriptor = "([BII[BII)I",
      garbageValue = "-1958410774"
  )
  @Export("compress")
  int compress(byte[] var1, int var2, int var3, byte[] var4, int var5) {
    int var6 = 0; // L: 63
    int var7 = var5 << 3; // L: 64

    for (var3 += var2; var2 < var3; ++var2) { // L: 65 66
      int var8 = var1[var2] & 255; // L: 67
      int var9 = this.masks[var8]; // L: 68
      byte var10 = this.bits[var8]; // L: 69
      if (var10 == 0) { // L: 70
        throw new RuntimeException("" + var8);
      }

      int var11 = var7 >> 3; // L: 71
      int var12 = var7 & 7; // L: 72
      var6 &= -var12 >> 31; // L: 73
      int var13 = (var12 + var10 - 1 >> 3) + var11; // L: 74
      var12 += 24; // L: 76
      var4[var11] = (byte) (var6 |= var9 >>> var12); // L: 77
      if (var11 < var13) { // L: 78
        ++var11; // L: 79
        var12 -= 8; // L: 80
        var4[var11] = (byte) (var6 = var9 >>> var12);
        if (var11 < var13) {
          ++var11; // L: 83
          var12 -= 8;
          var4[var11] = (byte) (var6 = var9 >>> var12);
          if (var11 < var13) {
            ++var11;
            var12 -= 8; // L: 88
            var4[var11] = (byte) (var6 = var9 >>> var12); // L: 89
            if (var11 < var13) {
              ++var11;
              var12 -= 8; // L: 92
              var4[var11] = (byte) (var6 = var9 << -var12);
            }
          }
        }
      }

      var7 += var10;
    }

    return (var7 + 7 >> 3) - var5; // L: 97
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      descriptor = "([BI[BIII)I",
      garbageValue = "1331615778"
  )
  @Export("decompress")
  int decompress(byte[] var1, int var2, byte[] var3, int var4, int var5) {
    if (var5 == 0) {
      return 0;
    } else {
      int var6 = 0; // L: 102
      var5 += var4; // L: 103
      int var7 = var2;

      while (true) {
        byte var8 = var1[var7];
        if (var8 < 0) {
          var6 = this.keys[var6];
        } else {
          ++var6; // L: 109
        }

        int var9;
        if ((var9 = this.keys[var6]) < 0) { // L: 110
          var3[var4++] = (byte) (~var9);
          if (var4 >= var5) {
            break;
          }

          var6 = 0;
        }

        if ((var8 & 64) != 0) { // L: 115
          var6 = this.keys[var6];
        } else {
          ++var6; // L: 116
        }

        if ((var9 = this.keys[var6]) < 0) {
          var3[var4++] = (byte) (~var9);
          if (var4 >= var5) { // L: 119
            break;
          }

          var6 = 0; // L: 120
        }

        if ((var8 & 32) != 0) { // L: 122
          var6 = this.keys[var6];
        } else {
          ++var6; // L: 123
        }

        if ((var9 = this.keys[var6]) < 0) { // L: 124
          var3[var4++] = (byte) (~var9); // L: 125
          if (var4 >= var5) {
            break;
          }

          var6 = 0;
        }

        if ((var8 & 16) != 0) {
          var6 = this.keys[var6];
        } else {
          ++var6; // L: 130
        }

        if ((var9 = this.keys[var6]) < 0) { // L: 131
          var3[var4++] = (byte) (~var9);
          if (var4 >= var5) { // L: 133
            break;
          }

          var6 = 0; // L: 134
        }

        if ((var8 & 8) != 0) { // L: 136
          var6 = this.keys[var6];
        } else {
          ++var6; // L: 137
        }

        if ((var9 = this.keys[var6]) < 0) { // L: 138
          var3[var4++] = (byte) (~var9); // L: 139
          if (var4 >= var5) { // L: 140
            break;
          }

          var6 = 0; // L: 141
        }

        if ((var8 & 4) != 0) { // L: 143
          var6 = this.keys[var6];
        } else {
          ++var6; // L: 144
        }

        if ((var9 = this.keys[var6]) < 0) { // L: 145
          var3[var4++] = (byte) (~var9); // L: 146
          if (var4 >= var5) { // L: 147
            break;
          }

          var6 = 0; // L: 148
        }

        if ((var8 & 2) != 0) { // L: 150
          var6 = this.keys[var6];
        } else {
          ++var6; // L: 151
        }

        if ((var9 = this.keys[var6]) < 0) { // L: 152
          var3[var4++] = (byte) (~var9); // L: 153
          if (var4 >= var5) { // L: 154
            break;
          }

          var6 = 0; // L: 155
        }

        if ((var8 & 1) != 0) {
          var6 = this.keys[var6]; // L: 157
        } else {
          ++var6; // L: 158
        }

        if ((var9 = this.keys[var6]) < 0) { // L: 159
          var3[var4++] = (byte) (~var9); // L: 160
          if (var4 >= var5) { // L: 161
            break;
          }

          var6 = 0; // L: 162
        }

        ++var7;
      }

      return var7 + 1 - var2; // L: 165
    }
  }
}
