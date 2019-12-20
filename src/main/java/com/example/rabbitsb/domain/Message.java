package com.example.rabbitsb.domain;

import java.io.Serializable;

public class Message implements Serializable {




    private String msg;
    private int num;

    public String getMsg() {
        return msg;
    }

    public int getNum() {
        return num;
    }

    public Message(String msg, int num) {
        this.msg = msg;
        this.num = num;
    }

    public Message() {
    }


    @Override
    public String toString() {
        return "Message{" +
                "msg='" + msg + '\'' +
                ", num=" + num +
                '}';
    }
}
