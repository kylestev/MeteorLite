import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      descriptor = "Ljp;"
  )
  @Export("ParamDefinition_archive")
  public static AbstractArchive ParamDefinition_archive;
  @ObfuscatedName("e")
  @ObfuscatedSignature(
      descriptor = "Lht;"
  )
  @Export("ParamDefinition_cached")
  static EvictingDualNodeHashTable ParamDefinition_cached;

  static {
    ParamDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
  }

  @ObfuscatedName("y")
  @ObfuscatedGetter(
      intValue = -1782057793
  )
  @Export("defaultInt")
  public int defaultInt;
  @ObfuscatedName("j")
  @Export("defaultStr")
  public String defaultStr;
  @ObfuscatedName("v")
  @Export("type")
  char type;
  @ObfuscatedName("o")
  @Export("autoDisable")
  boolean autoDisable;

  ParamComposition() {
    this.autoDisable = true; // L: 16
  } // L: 18

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-117"
  )
  @Export("postDecode")
  void postDecode() {
  } // L: 31

  @ObfuscatedName("v")
  @ObfuscatedSignature(
      descriptor = "(Lnt;B)V",
      garbageValue = "-90"
  )
  @Export("decode")
  void decode(Buffer var1) {
    while (true) {
      int var2 = var1.readUnsignedByte(); // L: 35
      if (var2 == 0) { // L: 36
        return; // L: 39
      }

      this.decodeNext(var1, var2); // L: 37
    }
  }

  @ObfuscatedName("y")
  @ObfuscatedSignature(
      descriptor = "(Lnt;IB)V",
      garbageValue = "-101"
  )
  @Export("decodeNext")
  void decodeNext(Buffer var1, int var2) {
    if (var2 == 1) { // L: 42
      byte var4 = var1.readByte(); // L: 44
      int var5 = var4 & 255; // L: 46
      if (var5 == 0) { // L: 47
        throw new IllegalArgumentException("" + Integer.toString(var5, 16));
      }

      if (var5 >= 128 && var5 < 160) { // L: 48
        char var6 = class302.cp1252AsciiExtension[var5 - 128]; // L: 49
        if (var6 == 0) { // L: 50
          var6 = '?';
        }

        var5 = var6; // L: 51
      }

      char var3 = (char) var5; // L: 53
      this.type = var3; // L: 55
    } else if (var2 == 2) { // L: 57
      this.defaultInt = var1.readInt();
    } else if (var2 == 4) { // L: 58
      this.autoDisable = false;
    } else if (var2 == 5) { // L: 59
      this.defaultStr = var1.readStringCp1252NullTerminated();
    }

  } // L: 61

  @ObfuscatedName("j")
  @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1047624515"
  )
  @Export("isString")
  public boolean isString() {
    return this.type == 's'; // L: 64
  }
}
