package com.moons.singlechat.singlechatmoons.application.controller;

import com.moons.singlechat.singlechatmoons.application.domain.LoggerType;
import com.moons.singlechat.singlechatmoons.application.model.ChatMessage;
import com.moons.singlechat.singlechatmoons.application.service.user.UserService;
import com.moons.singlechat.singlechatmoons.representation.UserRequest;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;


/**
 * Created by Miguel Fonseca on 20/06/2020
 */
@Controller
public class ChatController {

    private UserService userService;

    public ChatController(UserService userService) {
        this.userService = userService;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/message")
    public ChatMessage addUser(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor simpMessageHeaderAccessor) throws Exception{
        simpMessageHeaderAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        UserRequest userRequest = new UserRequest();
        userRequest.setNameUser(chatMessage.getSender());
        userRequest.setLoggerType(LoggerType.LOGIN);
        userService.registerUser(userRequest);
        return chatMessage;
    }

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/message")
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }

    @MessageMapping("/chat.logoutUser")
    @SendTo("/topic/message")
    public ChatMessage dropUser(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor simpMessageHeaderAccessor) throws Exception{
        simpMessageHeaderAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        UserRequest userRequest = new UserRequest();
        userRequest.setNameUser(chatMessage.getSender());
        userRequest.setLoggerType(LoggerType.LOGOUT);
        userService.registerUser(userRequest);
        return chatMessage;
    }

}
