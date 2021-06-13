package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("FriendsList")
public class FriendsList extends UserList {
   @ObfuscatedName("rn")
   @ObfuscatedGetter(
      intValue = 993918805
   )
   static int field3812;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lnc;"
   )
   @Export("loginType")
   final LoginType loginType;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1152075333
   )
   int field3808 = 1;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Lkm;"
   )
   @Export("friendLoginUpdates")
   public LinkDeque friendLoginUpdates = new LinkDeque();

   @ObfuscatedSignature(
      descriptor = "(Lnc;)V"
   )
   public FriendsList(LoginType var1) {
      super(400);
      this.loginType = var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)Llx;",
      garbageValue = "126"
   )
   @Export("newInstance")
   User newInstance() {
      return new Friend();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(II)[Llx;",
      garbageValue = "1924184817"
   )
   @Export("newTypedArray")
   User[] newTypedArray(int var1) {
      return new Friend[var1];
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lly;ZB)Z",
      garbageValue = "112"
   )
   @Export("isFriended")
   public boolean isFriended(Username var1, boolean var2) {
      Friend var3 = (Friend)this.getByUsername(var1);
      if (var3 == null) {
         return false;
      } else {
         return !var2 || var3.world != 0;
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Lnd;II)V",
      garbageValue = "1726713479"
   )
   @Export("read")
   public void read(Buffer var1, int var2) {
      while(true) {
         if (var1.offset < var2) {
            boolean var3 = var1.readUnsignedByte() == 1;
            Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
            Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
            int var6 = var1.readUnsignedShort();
            int var7 = var1.readUnsignedByte();
            int var8 = var1.readUnsignedByte();
            boolean var9 = (var8 & 2) != 0;
            boolean var10 = (var8 & 1) != 0;
            if (var6 > 0) {
               var1.readStringCp1252NullTerminated();
               var1.readUnsignedByte();
               var1.readInt();
            }

            var1.readStringCp1252NullTerminated();
            if (var4 != null && var4.hasCleanName()) {
               Friend var11 = (Friend)this.getByCurrentUsername(var4);
               if (var3) {
                  Friend var12 = (Friend)this.getByCurrentUsername(var5);
                  if (var12 != null && var12 != var11) {
                     if (var11 != null) {
                        this.remove(var12);
                     } else {
                        var11 = var12;
                     }
                  }
               }

               if (var11 != null) {
                  this.changeName(var11, var4, var5);
                  if (var6 != var11.world) {
                     boolean var14 = true;

                     for(FriendLoginUpdate var13 = (FriendLoginUpdate)this.friendLoginUpdates.last(); var13 != null; var13 = (FriendLoginUpdate)this.friendLoginUpdates.previous()) {
                        if (var13.username.equals(var4)) {
                           if (var6 != 0 && var13.world == 0) {
                              var13.remove();
                              var14 = false;
                           } else if (var6 == 0 && var13.world != 0) {
                              var13.remove();
                              var14 = false;
                           }
                        }
                     }

                     if (var14) {
                        this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
                     }
                  }
               } else {
                  if (this.getSize() >= 400) {
                     continue;
                  }

                  var11 = (Friend)this.addLast(var4, var5);
               }

               if (var6 != var11.world) {
                  var11.int2 = ++this.field3808 - 1;
                  if (var11.world == -1 && var6 == 0) {
                     var11.int2 = -(var11.int2 * -2116718473) * -1023710905;
                  }

                  var11.world = var6;
               }

               var11.rank = var7;
               var11.field3824 = var9;
               var11.field3823 = var10;
               continue;
            }

            throw new IllegalStateException();
         }

         this.sort();
         return;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lmr;ILjava/lang/String;B)Ljava/lang/String;",
      garbageValue = "98"
   )
   static String method5650(IterableNodeHashTable var0, int var1, String var2) {
      if (var0 == null) {
         return var2;
      } else {
         ObjectNode var3 = (ObjectNode)var0.get((long)var1);
         return var3 == null ? var2 : (String)var3.obj;
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(ILcf;ZI)I",
      garbageValue = "574138081"
   )
   static int method5647(int var0, Script var1, boolean var2) {
      int var3;
      int var4;
      if (var0 == 4000) {
         class44.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 + var4;
         return 1;
      } else if (var0 == 4001) {
         class44.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 - var4;
         return 1;
      } else if (var0 == 4002) {
         class44.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var4 * var3;
         return 1;
      } else if (var0 == 4003) {
         class44.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 / var4;
         return 1;
      } else if (var0 == 4004) {
         var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3);
         return 1;
      } else if (var0 == 4005) {
         var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1));
         return 1;
      } else {
         int var5;
         int var6;
         int var7;
         if (var0 == 4006) {
            class44.Interpreter_intStackSize -= 5;
            var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2];
            var6 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 3];
            var7 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 4];
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5);
            return 1;
         } else if (var0 == 4007) {
            class44.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 + var4 * var3 / 100;
            return 1;
         } else if (var0 == 4008) {
            class44.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 | 1 << var4;
            return 1;
         } else if (var0 == 4009) {
            class44.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4);
            return 1;
         } else if (var0 == 4010) {
            class44.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
            return 1;
         } else if (var0 == 4011) {
            class44.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 % var4;
            return 1;
         } else if (var0 == 4012) {
            class44.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
            if (var3 == 0) {
               Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
            } else {
               Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4);
            }

            return 1;
         } else if (var0 == 4013) {
            class44.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
            if (var3 == 0) {
               Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
               return 1;
            } else {
               switch(var4) {
               case 0:
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
                  break;
               case 1:
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3;
                  break;
               case 2:
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3);
                  break;
               case 3:
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3);
                  break;
               case 4:
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
                  break;
               default:
                  Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4);
               }

               return 1;
            }
         } else if (var0 == 4014) {
            class44.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 & var4;
            return 1;
         } else if (var0 == 4015) {
            class44.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 | var4;
            return 1;
         } else if (var0 == 4018) {
            class44.Interpreter_intStackSize -= 3;
            long var8 = (long)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
            long var10 = (long)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
            long var12 = (long)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (int)(var8 * var12 / var10);
            return 1;
         } else if (var0 == 4025) {
            var3 = SequenceDefinition.method3149(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3;
            return 1;
         } else if (var0 == 4026) {
            class44.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 ^ 1 << var4;
            return 1;
         } else if (var0 == 4027) {
            class44.Interpreter_intStackSize -= 3;
            var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class342.method6043(var3, var4, var5);
            return 1;
         } else if (var0 == 4028) {
            class44.Interpreter_intStackSize -= 3;
            var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = World.method1685(var3, var4, var5);
            return 1;
         } else if (var0 == 4029) {
            class44.Interpreter_intStackSize -= 3;
            var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2];
            var6 = 31 - var5;
            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 << var6 >>> var4 + var6;
            return 1;
         } else if (var0 == 4030) {
            class44.Interpreter_intStackSize -= 4;
            var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2];
            var6 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 3];
            var3 = World.method1685(var3, var5, var6);
            var7 = CollisionMap.method3185(var6 - var5 + 1);
            if (var4 > var7) {
               var4 = var7;
            }

            Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 | var4 << var5;
            return 1;
         } else {
            return 2;
         }
      }
   }
}
