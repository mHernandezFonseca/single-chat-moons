package com.moons.singlechat.singlechatmoons.application.service.user;

import com.moons.singlechat.singlechatmoons.application.domain.LoggerType;
import com.moons.singlechat.singlechatmoons.application.domain.User;
import com.moons.singlechat.singlechatmoons.repository.UserRepository;
import com.moons.singlechat.singlechatmoons.representation.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by Miguel Fonseca on 20/06/2020
 */
@Slf4j
@Service
public class UserServiceImpl  implements UserService{
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void registerUser(UserRequest userDto) throws Exception {
        User user = new User();
        user.setNameUser(userDto.getNameUser());
        user.setLoggerType(userDto.getLoggerType().toString());
        userRepository.save(user);
        log.info("User registered");
    }
}
