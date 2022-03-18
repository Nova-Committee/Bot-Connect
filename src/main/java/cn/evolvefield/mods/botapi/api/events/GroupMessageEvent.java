package cn.evolvefield.mods.botapi.api.events;

import cn.evolvefield.mods.botapi.api.message.MiraiMessage;
import net.minecraftforge.eventbus.api.Event;

import java.util.List;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/3/18 18:40
 * Version: 1.0
 */
public class GroupMessageEvent extends Event {
    private String self_id;//机器人qq
    private String message_id;//收到消息ID
    private String message;//收到消息
    private final String group_id;//消息群号
    private final String nickname;//发送人昵称
    private final String user_id;//发送人qq
    private String sub_type;//消息子类型
    private final String json;//消息原始文本

    private String group_name;//群名称
    private List<MiraiMessage> raw_message;//Mirai消息链

    //cq-http框架触发事件
    public GroupMessageEvent(String json,String self_id,String message_id,String message,String group_id,String nickname,String user_id,String sub_type) {
        this.self_id = self_id;
        this.message_id = message_id;
        this.message = message;
        this.group_id = group_id;
        this.nickname = nickname;
        this.user_id = user_id;
        this.sub_type = sub_type;
        this.json = json;
    }
    //Mirai框架触发事件
    public GroupMessageEvent(String json, List<MiraiMessage> raw_message, String user_id, String memberName, String group_id, String group_name) {
        this.json = json;
        this.raw_message = raw_message;
        this.user_id = user_id;
        this.nickname = memberName;
        this.group_id = group_id;

        this.group_name = group_name;
    }


    //getter
    public String getGroupName() {
        return group_name;
    }
    public List<MiraiMessage> getMiraiMessage() {
        return raw_message;
    }
    public String getMessage() {
        return this.message;
    }
    public String getSelfId() {
        return this.self_id;
    }
    public String getMessageId() {
        return this.message_id;
    }
    public String getGroupId() {
        return this.group_id;
    }
    public String getNickName() {
        return this.nickname;
    }
    public String getUserId() {
        return this.user_id;
    }
    public String getSubType() {
        return this.sub_type;
    }
    public String getJson() {
        return this.json;
    }
}
