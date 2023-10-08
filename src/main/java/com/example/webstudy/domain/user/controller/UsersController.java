package com.example.realworld.domain.user.controller;

/**
 * @Author：LC
 * @Package：com.example.realworld.domain.user.controller
 * @Project：realworld-springboot
 * @name：UsersController
 * @Date：2023/10/8 15:01
 * @Filename：UsersController
 */

import com.example.realworld.domain.user.dto.UserDto;
import com.example.realworld.domain.user.service.UserService;
import com.example.realworld.security.AuthUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {
    private final UserService userService;

    @PostMapping
    public UserDto registration(@RequestBody @Valid UserDto.Registration registration) {
        return userService.registration(registration);
    }
    @PostMapping("/login")
    public UserDto login(@RequestBody @Valid UserDto.Login login) {
        return userService.login(login);
    }
    @GetMapping
    public UserDto currentUser(
            @AuthenticationPrincipal AuthUserDetails authUserDetails
    ){
        return userService.currentUser(authUserDetails);
    }

    @PutMapping
    public UserDto update(
            @Valid @RequestBody UserDto.Update update,
            @AuthenticationPrincipal AuthUserDetails authUserDetails
    ){
        return userService.update(update, authUserDetails);
    }
}
