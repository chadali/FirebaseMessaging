package com.chadali.ncstatemessaging;

import java.nio.channels.Channel;
import java.util.Date;

/**
 * Created by Ali on 6/23/2017.
 */

public class ChannelMessage {

    private String messageText;
    private String messageUser;
    private long messageTime;

    public ChannelMessage(String messageText, String messageUser) {
        this.messageText = messageText;
        this.messageUser = messageUser;

        // Initialize to current time
        messageTime = new Date().getTime();
    }

    public ChannelMessage(){

    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}