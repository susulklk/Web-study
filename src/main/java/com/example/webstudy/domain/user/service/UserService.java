package com.example.realworld.domain.user.service;

/**
 * @Author：LC
 * @Package：com.example.realworld.domain.user.service
 * @Project：realworld-springboot
 * @name：UserService
 * @Date：2023/10/8 15:02
 * @Filename：UserService
 */
import com.example.realworld.domain.user.dto.UserDto;
import com.example.realworld.security.AuthUserDetails;

public interface UserService {
    UserDto registration(final UserDto.Registration registration);

    UserDto login(final UserDto.Login login);

    UserDto currentUser(final AuthUserDetails authUserDetails);

    UserDto update(final UserDto.Update update, final AuthUserDetails authUserDetails);
}
