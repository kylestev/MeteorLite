package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
public class class1 extends class14 {
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 920679423
   )
   int field5;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -2074698601
   )
   int field6;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1666414987
   )
   int field8;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1361309885
   )
   int field9;
   @ObfuscatedSignature(
      descriptor = "Lf;"
   )
   final class2 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lf;)V"
   )
   class1(class2 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lnd;I)V",
      garbageValue = "-1281352827"
   )
   void vmethod276(Buffer var1) {
      this.field5 = var1.readInt();
      this.field9 = var1.readInt();
      this.field6 = var1.readUnsignedByte();
      this.field8 = var1.readUnsignedByte();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ll;B)V",
      garbageValue = "29"
   )
   void vmethod281(ClanSettings var1) {
      var1.method113(this.field5, this.field9, this.field6, this.field8);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljv;Ljv;B)V",
      garbageValue = "10"
   )
   public static void method13(AbstractArchive var0, AbstractArchive var1) {
      SpotAnimationDefinition.SpotAnimationDefinition_archive = var0;
      SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1;
   }

   @ObfuscatedName("hq")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "22"
   )
   static void method11() {
      Client.menuOptionsCount = 0;
      Client.isMenuOpen = false;
   }

   @ObfuscatedName("kf")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-375078554"
   )
   static final void method7(int var0, int var1) {
      ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : ApproximateRouteStrategy.guestClanChannel;
      if (var2 != null && var1 >= 0 && var1 < var2.method27()) {
         ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
         if (var3.rank == -1) {
            String var4 = var3.name;
            PacketWriter var5 = Client.packetWriter;
            PacketBufferNode var6 = class21.getPacketBufferNode(ClientPacket.field2651, var5.isaacCipher);
            var6.packetBuffer.writeByte(3 + Tiles.stringCp1252NullTerminatedByteSize(var4));
            var6.packetBuffer.writeByte(var0);
            var6.packetBuffer.writeShort(var1);
            var6.packetBuffer.writeStringCp1252NullTerminated(var4);
            var5.addNode(var6);
         }
      }

   }
}
