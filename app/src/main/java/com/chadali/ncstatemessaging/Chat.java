package com.chadali.ncstatemessaging;

import java.util.Date;

/**
 * Created by Ali on 6/23/2017.
 */

public class Chat {

    public String lastMessage;
    public Long chatTimestamp;
    public String chatTitle;

    public Chat() {

    }

    public Chat(String title){
        this.chatTitle = title;
        this.lastMessage = "Initialized";

        chatTimestamp = new Date().getTime();
    }
}
