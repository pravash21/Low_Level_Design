package com.facebook;

public class Message {
    private Integer messageId;
    private Member[] sentTo;
    private String messageBody;
    private byte[] media;
    public boolean addMember(Member member) {
        return true;
    }
}
