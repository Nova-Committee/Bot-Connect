package cn.evolvefield.mods.botapi.common.command;

import cn.evolvefield.mods.botapi.BotApi;
import cn.evolvefield.mods.botapi.common.config.ConfigManger;
import cn.evolvefield.mods.botapi.core.bot.BotData;
import cn.evolvefield.mods.botapi.core.service.WebSocketService;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/4/7 17:21
 * Version: 1.0
 */
public class CqhttpCmd extends CommandBase {
    @Override
    public String getName() {
        return "cqhttp";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "/mcbot connect cqhttp <host:port>";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {

        if (args[0] != null) {
            String parameter = args[0];
            Pattern pattern = Pattern.compile("(\\d+\\.\\d+\\.\\d+\\.\\d+):(\\d+)");
            Matcher matcher = pattern.matcher(parameter);
            if (matcher.find()) {
                BotData.setWs("ws://" + parameter);
                BotApi.config.getCommon().setWsCommon("ws://" + parameter);
                BotData.setBotFrame("cqhttp");
                BotApi.config.getCommon().setFrame("cqhttp");
                sender.sendMessage(new TextComponentString("尝试链接框架" + TextFormatting.LIGHT_PURPLE + "cqhttp"));
                WebSocketService.main(BotData.getWs());
                BotApi.config.getStatus().setRECEIVE_ENABLED(true);
                BotApi.config.getCommon().setEnable(true);
                ConfigManger.saveBotConfig(BotApi.config);

            } else {
                sender.sendMessage(new TextComponentString(TextFormatting.RED + "参数错误❌"));
            }
            return;
        }


    }
}