package cn.evolvefield.mods.botapi.common.config;

import com.google.gson.annotations.SerializedName;

public class BotConfig{

    public String getConfigName() {
        return "botapi";
    }

    public Common getCommon() {
        return common;
    }

    public void setCommon(Common common) {
        this.common = common;
    }

    @SerializedName("common")
    private Common common = new Common();


    public static class Common {
        @SerializedName("frame")
        private String frame = "0";//0 --- go-cqhttp/// 1 ---- mirai
        @SerializedName("groupId")
        private String groupId = "0";
        @SerializedName("wsHost")
        private String wsHost = "127.0.0.1";
        @SerializedName("wsPort")
        private int wsPort = 6700;
        @SerializedName("wsKey")
        private String wsKey = "";
        @SerializedName("Enable")
        private boolean Enable = true;
        @SerializedName("Debuggable")
        private boolean Debuggable = false;
        @SerializedName("welcomeNotice")
        private String welcomeNotice = "欢迎加群~";
        @SerializedName("leaveNotice")
        private String leaveNotice = "有人离开了我们qwq";
        @SerializedName("commandStart")
        private String commandStart = "!";
        @SerializedName("bindCommand")
        private String bindCommand = "bind";
        @SerializedName("bindSuccess")
        private String bindSuccess =
                "▌绑定成功 ┈━═☆\n" +
                "成功绑定账号: %Player%\n" +
                "你他妈绑定成功了呢~\"";
        @SerializedName("bindFail")
        private String bindFail =
                "▌绑定失败 ┈━═☆\n" +
                "你的QQ已经绑定或 %Player% 已被绑定\n" +
                 "你他妈不能再绑定了呢~";
        @SerializedName("bindNotOnline")
        private String bindNotOnline =
                "▌玩家不在线 ┈━═☆\n" +
                "%Player% 不在线或者不存在哦\n" +
                "还他妈不上线搁这玩QQ呢~";
        @SerializedName("qqPrefix")
        private String qqPrefix = "MC";

        @SerializedName("RECEIVE_ENABLED")
        private boolean RECEIVE_ENABLED = true;
        @SerializedName("R_COMMAND_ENABLED")
        private boolean R_COMMAND_ENABLED = true;
        @SerializedName("R_CHAT_ENABLE")
        private boolean R_CHAT_ENABLE = true;
        @SerializedName("SEND_ENABLED")
        private boolean SEND_ENABLED = true;
        @SerializedName("WELCOME_ENABLE")
        private boolean S_WELCOME_ENABLE = true;
        @SerializedName("JOIN_ENABLE")
        private boolean S_JOIN_ENABLE = true;
        @SerializedName("LEAVE_ENABLE")
        private boolean S_LEAVE_ENABLE = true;
        @SerializedName("DEATH_ENABLE")
        private boolean S_DEATH_ENABLE = true;
        @SerializedName("S_CHAT_ENABLE")
        private boolean S_CHAT_ENABLE = true;
        @SerializedName("S_ADVANCE_ENABLE")
        private boolean S_ADVANCE_ENABLE = true;

        public String getFrame() {
            return frame;
        }

        public void setFrame(String frame) {
            this.frame = frame;
        }

        public String getGroupId() {
            return groupId;
        }

        public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        public int getWsPort() {
            return wsPort;
        }

        public void setWsPort(int wsPort) {
            this.wsPort = wsPort;
        }

        public String getWsHost() {
            return wsHost;
        }

        public void setWsHost(String wsHost) {
            this.wsHost = wsHost;
        }

        public String getWsKey() {
            return wsKey;
        }

        public void setWsKey(String wsKey) {
            this.wsKey = wsKey;
        }

        public boolean isEnable() {
            return Enable;
        }

        public void setEnable(boolean enable) {
            this.Enable = enable;
        }

        public boolean isDebuggable() {
            return Debuggable;
        }

        public void setDebuggable(boolean debuggable) {
            this.Debuggable = debuggable;
        }

        public String getBindFail() {
            return bindFail;
        }

        public String getBindNotOnline() {
            return bindNotOnline;
        }

        public String getBindSuccess() {
            return bindSuccess;
        }

        public String getBindCommand() {
            return bindCommand;
        }

        public void setBindCommand(String bindCommand) {
            this.bindCommand = bindCommand;
        }

        public String getQqPrefix() {
            return qqPrefix;
        }

        public void setQqPrefix(String qqPrefix) {
            this.qqPrefix = qqPrefix;
        }

        public String getCommandStart() {
            return commandStart;
        }

        public void setCommandStart(String commandStart) {
            this.commandStart = commandStart;
        }

        public void setS_WELCOME_ENABLE(boolean s_WELCOME_ENABLE) {
            S_WELCOME_ENABLE = s_WELCOME_ENABLE;
        }

        public boolean isS_WELCOME_ENABLE() {
            return S_WELCOME_ENABLE;
        }

        public String getWelcomeNotice() {
            return welcomeNotice;
        }

        public void setWelcomeNotice(String welcomeNotice) {
            this.welcomeNotice = welcomeNotice;
        }

        public String getLeaveNotice() {
            return leaveNotice;
        }

        public void setLeaveNotice(String leaveNotice) {
            this.leaveNotice = leaveNotice;
        }

        public boolean isRECEIVE_ENABLED() {
            return RECEIVE_ENABLED;
        }

        public void setRECEIVE_ENABLED(boolean RECEIVE_ENABLED) {
            this.RECEIVE_ENABLED = RECEIVE_ENABLED;
        }

        public boolean isR_CHAT_ENABLE() {
            return R_CHAT_ENABLE;
        }

        public void setR_CHAT_ENABLE(boolean r_CHAT_ENABLE) {
            R_CHAT_ENABLE = r_CHAT_ENABLE;
        }

        public boolean isR_COMMAND_ENABLED() {
            return R_COMMAND_ENABLED;
        }

        public void setR_COMMAND_ENABLED(boolean r_COMMAND_ENABLED) {
            R_COMMAND_ENABLED = r_COMMAND_ENABLED;
        }

        public boolean isSEND_ENABLED() {
            return SEND_ENABLED;
        }

        public void setSEND_ENABLED(boolean SEND_ENABLED) {
            this.SEND_ENABLED = SEND_ENABLED;
        }

        public boolean isS_JOIN_ENABLE() {
            return S_JOIN_ENABLE;
        }

        public void setS_JOIN_ENABLE(boolean s_JOIN_ENABLE) {
            this.S_JOIN_ENABLE = s_JOIN_ENABLE;
        }

        public boolean isS_LEAVE_ENABLE() {
            return S_LEAVE_ENABLE;
        }

        public void setS_LEAVE_ENABLE(boolean s_LEAVE_ENABLE) {
            this.S_LEAVE_ENABLE = s_LEAVE_ENABLE;
        }

        public boolean isS_DEATH_ENABLE() {
            return S_DEATH_ENABLE;
        }

        public void setS_DEATH_ENABLE(boolean s_DEATH_ENABLE) {
            this.S_DEATH_ENABLE = s_DEATH_ENABLE;
        }

        public boolean isS_CHAT_ENABLE() {
            return S_CHAT_ENABLE;
        }

        public void setS_CHAT_ENABLE(boolean s_CHAT_ENABLE) {
            S_CHAT_ENABLE = s_CHAT_ENABLE;
        }

        public boolean isS_ADVANCE_ENABLE() {
            return S_ADVANCE_ENABLE;
        }

        public void setS_ADVANCE_ENABLE(boolean s_ADVANCE_ENABLE) {
            S_ADVANCE_ENABLE = s_ADVANCE_ENABLE;
        }
    }


}
