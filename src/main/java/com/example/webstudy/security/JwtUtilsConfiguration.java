package com.example.realworld.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author：LC
 * @Package：com.example.realworld.util
 * @Project：realworld-springboot
 * @name：JwtUtilsConfiguration
 * @Date：2023/10/8 14:54
 * @Filename：JwtUtilsConfiguration
 */
@Configuration
public class JwtUtilsConfiguration {

    @Bean
    public JwtUtils getJwtUtils(
            @Value("${realworld.auth.token.sign-key}") String signKey,
            @Value("${realworld.auth.token.valid-time}") Long validTime
    ) throws Exception {
        if (signKey.length() < 32) {
            throw new Exception("signKey must have length at least 32");
        }
        return new JwtUtils(signKey, validTime);
    }
}
