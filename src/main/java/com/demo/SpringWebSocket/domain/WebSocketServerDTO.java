package com.demo.SpringWebSocket.domain;

public class WebSocketServerDTO {

    public WebSocketServerDTO(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;
}
