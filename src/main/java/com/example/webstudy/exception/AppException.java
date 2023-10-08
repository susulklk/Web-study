package com.example.realworld.exception;

import lombok.Getter;

/**
 * @Author：LC
 * @Package：com.example.realworld.exception
 * @Project：realworld-springboot
 * @name：AppException
 * @Date：2023/10/8 15:13
 * @Filename：AppException
 */
@Getter
public class AppException extends RuntimeException {
    private final Error error;
    public AppException(Error error) {
        super(error.getMessage());
        this.error = error;
    }
}
