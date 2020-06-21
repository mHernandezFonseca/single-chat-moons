package com.moons.singlechat.singlechatmoons.representation;

import com.moons.singlechat.singlechatmoons.application.domain.LoggerType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Miguel Fonseca on 20/06/2020
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {
    private String nameUser;
    private LoggerType loggerType;
}
