package com.moons.singlechat.singlechatmoons.application.service.user;

import com.moons.singlechat.singlechatmoons.representation.UserRequest;

/**
 * Created by Miguel Fonseca on 20/06/2020
 */
public interface UserService {
    void registerUser(UserRequest userDto) throws Exception;
}
