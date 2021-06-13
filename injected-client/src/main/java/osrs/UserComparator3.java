package osrs;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("dx")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
   @ObfuscatedName("tb")
   @ObfuscatedSignature(
      descriptor = "Lje;"
   )
   public static class285 field1444;
   @ObfuscatedName("fd")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("fontPlain12")
   static Font fontPlain12;
   @ObfuscatedName("v")
   @Export("reversed")
   final boolean reversed;

   public UserComparator3(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Llv;Llv;I)I",
      garbageValue = "2053904932"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var2.world != var1.world) {
         return this.reversed ? var1.world - var2.world : var2.world - var1.world;
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lnb;I)V",
      garbageValue = "1636861714"
   )
   @Export("performReflectionCheck")
   public static void performReflectionCheck(PacketBuffer var0) {
      ReflectionCheck var1 = (ReflectionCheck)class69.reflectionChecks.last();
      if (var1 != null) {
         int var2 = var0.offset;
         var0.writeInt(var1.id);

         for(int var3 = 0; var3 < var1.size; ++var3) {
            if (var1.creationErrors[var3] != 0) {
               var0.writeByte(var1.creationErrors[var3]);
            } else {
               try {
                  int var4 = var1.operations[var3];
                  Field var5;
                  int var6;
                  if (var4 == 0) {
                     var5 = var1.fields[var3];
                     var6 = Reflection.getInt(var5, (Object)null);
                     var0.writeByte(0);
                     var0.writeInt(var6);
                  } else if (var4 == 1) {
                     var5 = var1.fields[var3];
                     Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]);
                     var0.writeByte(0);
                  } else if (var4 == 2) {
                     var5 = var1.fields[var3];
                     var6 = var5.getModifiers();
                     var0.writeByte(0);
                     var0.writeInt(var6);
                  }

                  Method var7;
                  if (var4 != 3) {
                     if (var4 == 4) {
                        var7 = var1.methods[var3];
                        var6 = var7.getModifiers();
                        var0.writeByte(0);
                        var0.writeInt(var6);
                     }
                  } else {
                     var7 = var1.methods[var3];
                     byte[][] var8 = var1.arguments[var3];
                     Object[] var9 = new Object[var8.length];

                     for(int var10 = 0; var10 < var8.length; ++var10) {
                        ObjectInputStream var11 = new ObjectInputStream(new ByteArrayInputStream(var8[var10]));
                        var9[var10] = var11.readObject();
                     }

                     Object var24 = Reflection.invoke(var7, (Object)null, var9);
                     if (var24 == null) {
                        var0.writeByte(0);
                     } else if (var24 instanceof Number) {
                        var0.writeByte(1);
                        var0.writeLong(((Number)var24).longValue());
                     } else if (var24 instanceof String) {
                        var0.writeByte(2);
                        var0.writeStringCp1252NullTerminated((String)var24);
                     } else {
                        var0.writeByte(4);
                     }
                  }
               } catch (ClassNotFoundException var12) {
                  var0.writeByte(-10);
               } catch (InvalidClassException var13) {
                  var0.writeByte(-11);
               } catch (StreamCorruptedException var14) {
                  var0.writeByte(-12);
               } catch (OptionalDataException var15) {
                  var0.writeByte(-13);
               } catch (IllegalAccessException var16) {
                  var0.writeByte(-14);
               } catch (IllegalArgumentException var17) {
                  var0.writeByte(-15);
               } catch (InvocationTargetException var18) {
                  var0.writeByte(-16);
               } catch (SecurityException var19) {
                  var0.writeByte(-17);
               } catch (IOException var20) {
                  var0.writeByte(-18);
               } catch (NullPointerException var21) {
                  var0.writeByte(-19);
               } catch (Exception var22) {
                  var0.writeByte(-20);
               } catch (Throwable var23) {
                  var0.writeByte(-21);
               }
            }
         }

         var0.writeCrc(var2);
         var1.remove();
      }

   }

   @ObfuscatedName("iv")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "-1768191443"
   )
   @Export("formatItemStacks")
   static final String formatItemStacks(int var0) {
      String var1 = Integer.toString(var0);

      for(int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
         var1 = var1.substring(0, var2) + "," + var1.substring(var2);
      }

      if (var1.length() > 9) {
         return " " + class44.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M  (" + var1 + ")</col>";
      } else {
         return var1.length() > 6 ? " " + class44.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K  (" + var1 + ")</col>" : " " + class44.colorStartTag(16776960) + var1 + "</col>";
      }
   }
}
