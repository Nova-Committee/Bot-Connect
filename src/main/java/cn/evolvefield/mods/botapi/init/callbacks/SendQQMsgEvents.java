package cn.evolvefield.mods.botapi.init.callbacks;


import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/1/11 22:11
 * Version: 1.0
 */
public final class SendQQMsgEvents {
    public static final Event<Send_QQ_Msg> SEND_QQ_MSG = EventFactory.createArrayBacked(Send_QQ_Msg.class, callbacks -> (world, player) -> {
        for (Send_QQ_Msg callback : callbacks) {
            callback.onTick(world, player);
        }
    });

    public SendQQMsgEvents() {
    }


    @FunctionalInterface
    public interface Send_QQ_Msg {
        void onTick(ServerLevel world, ServerPlayer player);
    }
}
