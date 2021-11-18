package dev.hoot.api.packets;

import dev.hoot.api.game.Game;
import net.runelite.api.widgets.Widget;
import osrs.Client;
import osrs.ClientPacket;

import java.util.List;

public class WidgetPackets {

    public static void queueResumePauseWidgetPacket(int var0, int var1){
        osrs.PacketBufferNode var2 = (osrs.PacketBufferNode) Game.getClient().preparePacket(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
        var2.packetBuffer.writeIntME2(var0);
        var2.packetBuffer.writeShort(var1);
        Client.packetWriter.addNode(var2);
    }

    public static void queueWidgetActionPacket(int widgetID, int itemID, int itemSlot){
        osrs.PacketBufferNode var10 = (osrs.PacketBufferNode) Game.getClient().preparePacket(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher);
        var10.packetBuffer.writeInt(widgetID);
        var10.packetBuffer.writeShort(itemSlot);
        var10.packetBuffer.writeShort(itemID);
        Client.packetWriter.addNode(var10);
    }

    public static void queueWidgetAction2Packet(int widgetID, int itemID, int itemSlot){
        osrs.PacketBufferNode var10 = (osrs.PacketBufferNode) Game.getClient().preparePacket(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher);
        var10.packetBuffer.writeInt(widgetID);
        var10.packetBuffer.writeShort(itemSlot);
        var10.packetBuffer.writeShort(itemID);
        Client.packetWriter.addNode(var10);
    }
    public static void queueWidgetAction3Packet(int widgetID, int itemID, int itemSlot){
        osrs.PacketBufferNode var10 = (osrs.PacketBufferNode) Game.getClient().preparePacket(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher);
        var10.packetBuffer.writeInt(widgetID);
        var10.packetBuffer.writeShort(itemSlot);
        var10.packetBuffer.writeShort(itemID);
        Client.packetWriter.addNode(var10);
    }
    public static void queueWidgetAction4Packet(int widgetID, int itemID, int itemSlot){
        osrs.PacketBufferNode var10 = (osrs.PacketBufferNode) Game.getClient().preparePacket(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher);
        var10.packetBuffer.writeInt(widgetID);
        var10.packetBuffer.writeShort(itemSlot);
        var10.packetBuffer.writeShort(itemID);
        Client.packetWriter.addNode(var10);
    }
    public static void queueWidgetAction5Packet(int widgetID, int itemID, int itemSlot){
        osrs.PacketBufferNode var10 = (osrs.PacketBufferNode) Game.getClient().preparePacket(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher);
        var10.packetBuffer.writeInt(widgetID);
        var10.packetBuffer.writeShort(itemSlot);
        var10.packetBuffer.writeShort(itemID);
        Client.packetWriter.addNode(var10);
    }
    public static void queueWidgetAction6Packet(int widgetID, int itemID, int itemSlot){
        osrs.PacketBufferNode var10 = (osrs.PacketBufferNode) Game.getClient().preparePacket(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher);
        var10.packetBuffer.writeInt(widgetID);
        var10.packetBuffer.writeShort(itemSlot);
        var10.packetBuffer.writeShort(itemID);
        Client.packetWriter.addNode(var10);
    }
    public static void queueWidgetAction7Packet(int widgetID, int itemID, int itemSlot){
        osrs.PacketBufferNode var10 = (osrs.PacketBufferNode) Game.getClient().preparePacket(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher);
        var10.packetBuffer.writeInt(widgetID);
        var10.packetBuffer.writeShort(itemSlot);
        var10.packetBuffer.writeShort(itemID);
        Client.packetWriter.addNode(var10);
    }
    public static void queueWidgetAction8Packet(int widgetID, int itemID, int itemSlot){
        osrs.PacketBufferNode var10 = (osrs.PacketBufferNode) Game.getClient().preparePacket(ClientPacket.IF_BUTTON8, Client.packetWriter.isaacCipher);
        var10.packetBuffer.writeInt(widgetID);
        var10.packetBuffer.writeShort(itemSlot);
        var10.packetBuffer.writeShort(itemID);
        Client.packetWriter.addNode(var10);
    }
    public static void queueWidgetAction9Packet(int widgetID, int itemID, int itemSlot){
        osrs.PacketBufferNode var10 = (osrs.PacketBufferNode) Game.getClient().preparePacket(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher);
        var10.packetBuffer.writeInt(widgetID);
        var10.packetBuffer.writeShort(itemSlot);
        var10.packetBuffer.writeShort(itemID);
        Client.packetWriter.addNode(var10);
    }
    public static void queueWidgetAction10Packet(int widgetID, int itemID, int itemSlot){
        osrs.PacketBufferNode var10 = (osrs.PacketBufferNode) Game.getClient().preparePacket(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher);
        var10.packetBuffer.writeInt(widgetID);
        var10.packetBuffer.writeShort(itemSlot);
        var10.packetBuffer.writeShort(itemID);
        Client.packetWriter.addNode(var10);
    }
    public static void widgetFirstOption(Widget widget){
        queueWidgetActionPacket(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetSecondOption(Widget widget){
        queueWidgetAction2Packet(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetThirdOption(Widget widget){
        queueWidgetAction3Packet(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetFourthOption(Widget widget){
        queueWidgetAction4Packet(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetFifthOption(Widget widget){
        queueWidgetAction5Packet(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetSixthOption(Widget widget){
        queueWidgetAction6Packet(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetSeventhOption(Widget widget){
        queueWidgetAction7Packet(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetEighthOption(Widget widget){
        queueWidgetAction8Packet(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetNinthOption(Widget widget){
        queueWidgetAction9Packet(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetTenthOption(Widget widget){
        queueWidgetAction10Packet(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetAction(Widget widget,String action){
        List<String> actions = widget.getActions();
        if(actions==null){
            return;
        }
        int index = actions.indexOf(action);
        switch (index) {
            case 0 -> widgetFirstOption(widget);
            case 1 -> widgetSecondOption(widget);
            case 2 -> widgetThirdOption(widget);
            case 3 -> widgetFourthOption(widget);
            case 4 -> widgetFifthOption(widget);
            case 5 -> widgetSixthOption(widget);
            case 6 -> widgetSeventhOption(widget);
            case 7 -> widgetEighthOption(widget);
            case 8 -> widgetNinthOption(widget);
            case 9 -> widgetTenthOption(widget);
        }
    }
}
