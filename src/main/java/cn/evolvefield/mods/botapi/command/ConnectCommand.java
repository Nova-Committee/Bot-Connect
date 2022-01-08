package cn.evolvefield.mods.botapi.command;


import cn.evolvefield.mods.botapi.BotApi;
import cn.evolvefield.mods.botapi.config.ConfigManger;
import cn.evolvefield.mods.botapi.service.ClientThreadService;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandException;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.util.text.StringTextComponent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.minecraft.command.Commands.literal;

public class ConnectCommand {
    public static ArgumentBuilder<CommandSource, ?> register() {
        return literal("connect")
                .executes(ConnectCommand::receiveExecute)
                .then(Commands.argument("<address:port>", StringArgumentType.greedyString())
                                .executes(ConnectCommand::receiveExecute))
                ;
    }


    public static int receiveExecute(CommandContext<CommandSource> context) throws CommandException {
        String[] args = context.getInput().split("\\s+");
        switch(args.length) {
            default: {
                context.getSource().sendSuccess(new StringTextComponent("参数不合法"), true);
                break;
            }
            case 4: {
                Pattern pattern = Pattern.compile("(\\d+\\.\\d+\\.\\d+\\.\\d+):(\\d+)");
                Matcher matcher = pattern.matcher(args[3]);
                if (matcher.find()) {
                    BotApi.config.getCommon().setRECEIVE_ENABLED(true);
                    BotApi.config.getCommon().setWsHost(matcher.group(1));
                    BotApi.config.getCommon().setWsPort(Integer.parseInt(matcher.group(2)));
                    BotApi.config.getCommon().setWsKey(args[3]);
                    ConfigManger.saveBotConfig(BotApi.config);
                    context.getSource().sendSuccess(new StringTextComponent("已保存，正在尝试建立WebSocket连接"), true);
                    ClientThreadService.runWebSocketClient();
                } else {
                    context.getSource().sendSuccess(new StringTextComponent("格式错误"), true);
                }
                break;
            }
            case 3: {
                Pattern pattern = Pattern.compile("(\\d+\\.\\d+\\.\\d+\\.\\d+):(\\d+)");
                Matcher matcher = pattern.matcher(args[2]);
                if(matcher.find()) {
                    BotApi.config.getCommon().setRECEIVE_ENABLED(true);
                    BotApi.config.getCommon().setWsHost(matcher.group(1));
                    BotApi.config.getCommon().setWsPort(Integer.parseInt(matcher.group(2)));
                    ConfigManger.saveBotConfig(BotApi.config);
                    context.getSource().sendSuccess(new StringTextComponent("已保存，正在尝试建立WebSocket连接"), true);
                    ClientThreadService.runWebSocketClient();
                } else {
                    context.getSource().sendSuccess(new StringTextComponent("格式错误"), true);
                }
                break;
            }
            case 2: {
                context.getSource().sendSuccess(new StringTextComponent("尝试建立WebSocket连接"), true);
                ClientThreadService.runWebSocketClient();
                break;
            }
        }
        BotApi.config.getCommon().setEnable(true);
        ConfigManger.saveBotConfig(BotApi.config);
        return 0;
    }

}
