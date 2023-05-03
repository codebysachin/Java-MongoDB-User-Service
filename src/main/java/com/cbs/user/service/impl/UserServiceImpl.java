package com.cbs.user.service.impl;

import com.cbs.user.dto.UserDto;
import com.cbs.user.service.UserService;
import org.springframework.stereotype.Component;

@Component("UserServiceImpl")
public class UserServiceImpl implements UserService {
    @Override
    public UserDto getUserById(long l) {
        return new UserDto("firstname","lastname", null, null);
    }
}
