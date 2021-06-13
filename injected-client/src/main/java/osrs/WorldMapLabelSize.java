package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lfp;"
   )
   @Export("WorldMapLabelSize_small")
   public static final WorldMapLabelSize WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lfp;"
   )
   @Export("WorldMapLabelSize_medium")
   public static final WorldMapLabelSize WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lfp;"
   )
   @Export("WorldMapLabelSize_large")
   public static final WorldMapLabelSize WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0);
   @ObfuscatedName("en")
   @ObfuscatedGetter(
      intValue = -1635992925
   )
   @Export("worldPort")
   static int worldPort;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 945036671
   )
   final int field1935;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -2000938127
   )
   final int field1933;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -514580693
   )
   final int field1932;

   WorldMapLabelSize(int var1, int var2, int var3) {
      this.field1935 = var1;
      this.field1933 = var2;
      this.field1932 = var3;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(FI)Z",
      garbageValue = "535854948"
   )
   boolean method3215(float var1) {
      return var1 >= (float)this.field1932;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)[Lfp;",
      garbageValue = "368638280"
   )
   static WorldMapLabelSize[] method3221() {
      return new WorldMapLabelSize[]{WorldMapLabelSize_medium, WorldMapLabelSize_large, WorldMapLabelSize_small};
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)Lfp;",
      garbageValue = "658176697"
   )
   static WorldMapLabelSize method3208(int var0) {
      WorldMapLabelSize[] var1 = method3221();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         WorldMapLabelSize var3 = var1[var2];
         if (var0 == var3.field1933) {
            return var3;
         }
      }

      return null;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(CLkk;B)I",
      garbageValue = "4"
   )
   @Export("lowercaseChar")
   static int lowercaseChar(char var0, Language var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = (var0 << 4) + 1;
      }

      if (var0 == 241 && var1 == Language.Language_ES) {
         var2 = 1762;
      }

      return var2;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "4"
   )
   public static int method3206() {
      return KeyHandler.KeyHandler_idleCycles;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1934362980"
   )
   static void method3218() {
      Login.loginIndex = 24;
      class260.setLoginResponseString("", "You were disconnected from the server.", "");
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(ILcf;ZI)I",
      garbageValue = "1091146417"
   )
   static int method3217(int var0, Script var1, boolean var2) {
      int var3;
      int var4;
      int var5;
      EnumComposition var9;
      if (var0 == 3400) {
         class44.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
         var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
         var9 = InterfaceParent.getEnum(var3);
         if (var9.outputType != 's') {
            ;
         }

         for(var4 = 0; var4 < var9.outputCount; ++var4) {
            if (var5 == var9.keys[var4]) {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.strVals[var4];
               var9 = null;
               break;
            }
         }

         if (var9 != null) {
            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.defaultStr;
         }

         return 1;
      } else if (var0 != 3408) {
         if (var0 == 3411) {
            var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
            var9 = InterfaceParent.getEnum(var3);
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var9.size();
            return 1;
         } else {
            return 2;
         }
      } else {
         class44.Interpreter_intStackSize -= 4;
         var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
         var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
         int var6 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2];
         var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 3];
         EnumComposition var7 = InterfaceParent.getEnum(var6);
         if (var3 == var7.inputType && var5 == var7.outputType) {
            for(int var8 = 0; var8 < var7.outputCount; ++var8) {
               if (var4 == var7.keys[var8]) {
                  if (var5 == 115) {
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.strVals[var8];
                  } else {
                     Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var7.intVals[var8];
                  }

                  var7 = null;
                  break;
               }
            }

            if (var7 != null) {
               if (var5 == 115) {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.defaultStr;
               } else {
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var7.defaultInt;
               }
            }

            return 1;
         } else {
            if (var5 == 115) {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "null";
            } else {
               Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(ILcf;ZS)I",
      garbageValue = "-12947"
   )
   static int method3219(int var0, Script var1, boolean var2) {
      if (var0 == 3800) {
         if (NPCComposition.guestClanSettings != null) {
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1;
            class26.field220 = NPCComposition.guestClanSettings;
         } else {
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else {
         int var3;
         if (var0 == 3801) {
            var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
            if (Client.currentClanSettings[var3] != null) {
               Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1;
               class26.field220 = Client.currentClanSettings[var3];
            } else {
               Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else if (var0 == 3802) {
            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class26.field220.name;
            return 1;
         } else if (var0 == 3803) {
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.allowGuests ? 1 : 0;
            return 1;
         } else if (var0 == 3804) {
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.field103;
            return 1;
         } else if (var0 == 3805) {
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.field113;
            return 1;
         } else if (var0 == 3806) {
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.field98;
            return 1;
         } else if (var0 == 3807) {
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.field96;
            return 1;
         } else if (var0 == 3809) {
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.memberCount;
            return 1;
         } else if (var0 == 3810) {
            var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class26.field220.memberNames[var3];
            return 1;
         } else if (var0 == 3811) {
            var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.memberRanks[var3];
            return 1;
         } else if (var0 == 3812) {
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.bannedMemberCount;
            return 1;
         } else if (var0 == 3813) {
            var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class26.field220.bannedMemberNames[var3];
            return 1;
         } else {
            int var4;
            int var5;
            if (var0 == 3814) {
               class44.Interpreter_intStackSize -= 3;
               var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
               var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
               var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2];
               Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.method100(var3, var5, var4);
               return 1;
            } else if (var0 == 3815) {
               Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.currentOwner;
               return 1;
            } else if (var0 == 3816) {
               Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.field99;
               return 1;
            } else if (var0 == 3817) {
               Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.method99(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
               return 1;
            } else if (var0 == 3818) {
               Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize - 1] = class26.field220.getSortedMembers()[Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize - 1]];
               return 1;
            } else if (var0 == 3819) {
               class44.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
               var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
               class305.method5533(var5, var3);
               return 1;
            } else if (var0 == 3820) {
               var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.field101[var3];
               return 1;
            } else {
               if (var0 == 3821) {
                  class44.Interpreter_intStackSize -= 3;
                  var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
                  boolean var6 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1] == 1;
                  var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2];
                  class18.method216(var4, var3, var6);
               }

               if (var0 == 3822) {
                  var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.field108[var3] ? 1 : 0;
                  return 1;
               } else if (var0 == 3850) {
                  if (ApproximateRouteStrategy.guestClanChannel != null) {
                     Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1;
                     ArchiveLoader.field1147 = ApproximateRouteStrategy.guestClanChannel;
                  } else {
                     Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 3851) {
                  var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
                  if (Client.currentClanChannels[var3] != null) {
                     Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1;
                     ArchiveLoader.field1147 = Client.currentClanChannels[var3];
                     Interpreter.field982 = var3;
                  } else {
                     Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 3852) {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ArchiveLoader.field1147.name;
                  return 1;
               } else if (var0 == 3853) {
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ArchiveLoader.field1147.field26;
                  return 1;
               } else if (var0 == 3854) {
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ArchiveLoader.field1147.field32;
                  return 1;
               } else if (var0 == 3855) {
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ArchiveLoader.field1147.method27();
                  return 1;
               } else if (var0 == 3856) {
                  var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ((ClanChannelMember)ArchiveLoader.field1147.members.get(var3)).name;
                  return 1;
               } else if (var0 == 3857) {
                  var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ((ClanChannelMember)ArchiveLoader.field1147.members.get(var3)).rank;
                  return 1;
               } else if (var0 == 3858) {
                  var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ((ClanChannelMember)ArchiveLoader.field1147.members.get(var3)).world;
                  return 1;
               } else if (var0 == 3859) {
                  var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
                  class1.method7(Interpreter.field982, var3);
                  return 1;
               } else if (var0 == 3860) {
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ArchiveLoader.field1147.method30(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
                  return 1;
               } else if (var0 == 3861) {
                  Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize - 1] = ArchiveLoader.field1147.getSortedMembers()[Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize - 1]];
                  return 1;
               } else if (var0 == 3890) {
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class34.field254 != null ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(ILcf;ZB)I",
      garbageValue = "-41"
   )
   static int method3209(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == 4200) {
         var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
         Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class260.ItemDefinition_get(var3).name;
         return 1;
      } else {
         int var4;
         ItemComposition var5;
         if (var0 == 4201) {
            class44.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
            var5 = class260.ItemDefinition_get(var3);
            if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
            } else {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == 4202) {
            class44.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
            var5 = class260.ItemDefinition_get(var3);
            if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
            } else {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == 4203) {
            var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class260.ItemDefinition_get(var3).price;
            return 1;
         } else if (var0 == 4204) {
            var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class260.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
            return 1;
         } else {
            ItemComposition var6;
            if (var0 == 4205) {
               var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
               var6 = class260.ItemDefinition_get(var3);
               if (var6.noteTemplate == -1 && var6.note >= 0) {
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var6.note;
               } else {
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == 4206) {
               var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
               var6 = class260.ItemDefinition_get(var3);
               if (var6.noteTemplate >= 0 && var6.note >= 0) {
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var6.note;
               } else {
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == 4207) {
               var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class260.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
               return 1;
            } else if (var0 == 4208) {
               var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
               var6 = class260.ItemDefinition_get(var3);
               if (var6.placeholderTemplate == -1 && var6.placeholder >= 0) {
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var6.placeholder;
               } else {
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == 4209) {
               var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
               var6 = class260.ItemDefinition_get(var3);
               if (var6.placeholderTemplate >= 0 && var6.placeholder >= 0) {
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var6.placeholder;
               } else {
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == 4210) {
               String var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               var4 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
               ObjectComposition.findItemDefinitions(var7, var4 == 1);
               Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ClanSettings.foundItemIdCount;
               return 1;
            } else if (var0 != 4211) {
               if (var0 == 4212) {
                  Canvas.foundItemIndex = 0;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (Clock.foundItemIds != null && Canvas.foundItemIndex < ClanSettings.foundItemIdCount) {
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Clock.foundItemIds[++Canvas.foundItemIndex - 1] & '\uffff';
               } else {
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("kj")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2028267498"
   )
   @Export("updateSoundEffectVolume")
   static final void updateSoundEffectVolume(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      ObjectComposition.clientPreferences.soundEffectsVolume = var0;
      TileItem.savePreferences();
   }
}
