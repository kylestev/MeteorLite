import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
public class class246 {

  @ObfuscatedName("f")
  public static final short[] field2945;
  @ObfuscatedName("e")
  public static final short[][] field2944;
  @ObfuscatedName("v")
  public static final short[] field2943;
  @ObfuscatedName("y")
  public static final short[][] field2946;
  @ObfuscatedName("ix")
  @ObfuscatedGetter(
      intValue = 1746003047
  )
  @Export("selectedItemWidget")
  static int selectedItemWidget;

  static {
    field2945 = new short[]{6798, 8741, 25238, 4626, 4550}; // L: 4
    field2944 = new short[][]{
        {6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438,
            3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010},
        {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578,
            -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946,
            -15701, -14010},
        {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341,
            16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946,
            -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270},
        {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}}; // L: 5
    field2943 = new short[]{-10304, 9104, -1, -1, -1}; // L: 12
    field2946 = new short[][]{
        {6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446,
            3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002},
        {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565,
            -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835,
            -15460, -14019}, new short[0], new short[0], new short[0]}; // L: 13
  }

  @ObfuscatedName("kn")
  @ObfuscatedSignature(
      descriptor = "([Liv;IB)V",
      garbageValue = "1"
  )
  @Export("drawModelComponents")
  static final void drawModelComponents(Widget[] var0, int var1) {
    for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11056
      Widget var3 = var0[var2]; // L: 11057
      if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class35
          .isComponentHidden(var3))) { // L: 11058 11059 11060
        if (var3.type == 0) { // L: 11061
          if (!var3.isIf3 && class35.isComponentHidden(var3)
              && var3 != MusicPatchNode.mousedOverWidgetIf1) { // L: 11062
            continue;
          }

          drawModelComponents(var0, var3.id); // L: 11063
          if (var3.children != null) { // L: 11064
            drawModelComponents(var3.children, var3.id);
          }

          InterfaceParent var4 = (InterfaceParent) Client.interfaceParents
              .get((long) var3.id); // L: 11065
          if (var4 != null) { // L: 11066
            class25.method330(var4.group);
          }
        }

        if (var3.type == 6) { // L: 11068
          int var5;
          if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 11069
            boolean var7 = Friend.runCs1(var3); // L: 11070
            if (var7) { // L: 11072
              var5 = var3.sequenceId2;
            } else {
              var5 = var3.sequenceId; // L: 11073
            }

            if (var5 != -1) { // L: 11074
              SequenceDefinition var6 = WorldMapScaleHandler
                  .SequenceDefinition_get(var5); // L: 11075

              for (var3.modelFrameCycle += Client.field683;
                  var3.modelFrameCycle > var6.frameLengths[var3.modelFrame];
                  Script.invalidateWidget(var3)) { // L: 11076 11077 11084
                var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 11078
                ++var3.modelFrame; // L: 11079
                if (var3.modelFrame >= var6.frameIds.length) { // L: 11080
                  var3.modelFrame -= var6.frameCount; // L: 11081
                  if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 11082
                    var3.modelFrame = 0;
                  }
                }
              }
            }
          }

          if (var3.field2981 != 0 && !var3.isIf3) { // L: 11088
            int var8 = var3.field2981 >> 16; // L: 11089
            var5 = var3.field2981 << 16 >> 16; // L: 11090
            var8 *= Client.field683; // L: 11091
            var5 *= Client.field683; // L: 11092
            var3.modelAngleX = var8 + var3.modelAngleX & 2047; // L: 11093
            var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 11094
            Script.invalidateWidget(var3); // L: 11095
          }
        }
      }
    }

  } // L: 11099
}
