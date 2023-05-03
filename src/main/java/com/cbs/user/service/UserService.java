package com.cbs.user.service;

import com.cbs.user.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserDto getUserById(long l);
}
