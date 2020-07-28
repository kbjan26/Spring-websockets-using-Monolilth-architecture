package com.demo.SpringWebSocket.web;

import com.demo.SpringWebSocket.domain.WebSocketClientDTO;
import com.demo.SpringWebSocket.domain.WebSocketServerDTO;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class WebSocketController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public WebSocketServerDTO greeting(WebSocketClientDTO message) throws Exception {
        return new WebSocketServerDTO("Message from Server : Hello, " + HtmlUtils.htmlEscape(message.getClientText()) + "!");
    }
}
