package com.example.realworld.exception;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：LC
 * @Package：com.example.realworld.exception
 * @Project：realworld-springboot
 * @name：ErrorMessages
 * @Date：2023/10/8 15:18
 * @Filename：ErrorMessages
 */
@Getter
@JsonTypeName("errors")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT)
public class ErrorMessages {
    private final List<String> body;

    public ErrorMessages() {
        body = new ArrayList<>();
    }

    public void append(String message) {
        body.add(message);
    }
}