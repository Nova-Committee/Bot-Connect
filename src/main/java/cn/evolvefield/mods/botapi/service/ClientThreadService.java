package cn.evolvefield.mods.botapi.service;

import cn.evolvefield.mods.botapi.config.BotConfig;
import cn.evolvefield.mods.botapi.network.WebSocket.WebSocketClient;

public class ClientThreadService {
    public static WebSocketClient client;
    public static void runWebSocketClient() {
        int delay = 0;
        if (client != null) {
            client.interrupt();
        }
        client = new WebSocketClient(
                BotConfig.INSTANCE.getWsHOST(),
                BotConfig.INSTANCE.getWsPORT(),
                BotConfig.INSTANCE.getKEY());
        client.start();
    }
    /**
     * @return {@code true}: 已存在客户端; {@code false}: 不存在客户端
     * */
    public static boolean stopWebSocketClient() {
        boolean isStopSuccessfully = false;
        if (client != null) {
            client.interrupt();
            isStopSuccessfully = true;
        }
        client = null;
        return isStopSuccessfully;
    }
}
