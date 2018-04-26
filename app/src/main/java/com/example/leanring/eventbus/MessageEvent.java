package com.example.leanring.eventbus;

/**
 * 作者：CQ on 2018/4/24 15:38
 * 作用：
 */
public class MessageEvent {
    private String message;

    public MessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
