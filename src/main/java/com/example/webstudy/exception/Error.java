package com.example.realworld.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * @Author：LC
 * @Package：com.example.realworld.exception
 * @Project：realworld-springboot
 * @name：Error
 * @Date：2023/10/8 15:18
 * @Filename：Error
 */
@Getter
public enum Error {
    DUPLICATED_USER("there is duplicated user information", HttpStatus.UNPROCESSABLE_ENTITY),
    LOGIN_INFO_INVALID("login information is invalid", HttpStatus.UNPROCESSABLE_ENTITY),
    ALREADY_FOLLOWED_USER("already followed user", HttpStatus.UNPROCESSABLE_ENTITY),
    ALREADY_FAVORITED_ARTICLE("already followed user", HttpStatus.UNPROCESSABLE_ENTITY),

    USER_NOT_FOUND("user not found", HttpStatus.NOT_FOUND),
    FOLLOW_NOT_FOUND("such follow not found", HttpStatus.NOT_FOUND),
    ARTICLE_NOT_FOUND("article not found", HttpStatus.NOT_FOUND),
    FAVORITE_NOT_FOUND("favorite not found", HttpStatus.NOT_FOUND),
    COMMENT_NOT_FOUND("comment not found", HttpStatus.NOT_FOUND),
    ;

    private final String message;
    private final HttpStatus status;

    Error(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }
}