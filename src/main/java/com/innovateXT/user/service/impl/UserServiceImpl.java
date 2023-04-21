package com.innovateXT.user.service.impl;

import com.innovateXT.user.dto.UserDto;
import com.innovateXT.user.service.UserService;
import org.springframework.stereotype.Component;

@Component("UserServiceImpl")
public class UserServiceImpl implements UserService {
    @Override
    public UserDto getUserById(long l) {
        return new UserDto("firstname","lastname", null, null);
    }
}
