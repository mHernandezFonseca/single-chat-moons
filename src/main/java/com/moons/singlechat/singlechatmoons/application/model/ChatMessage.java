package com.moons.singlechat.singlechatmoons.application.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Miguel Fonseca on 20/06/2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatMessage {

    private MessageTypeEnum type;
    private String content;
    private String sender;

}
