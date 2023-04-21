package com.innovateXT.user.service;

import com.innovateXT.user.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserDto getUserById(long l);
}
