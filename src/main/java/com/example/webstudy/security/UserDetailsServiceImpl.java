package com.example.realworld.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author：LC
 * @Package：com.example.realworld.service
 * @Project：realworld-springboot
 * @name：UserDetailsServiceImpl
 * @Date：2023/10/8 14:52
 * @Filename：UserDetailsServiceImpl
 */
@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email)
                .map(userEntity ->
                        AuthUserDetails.builder()
                                .id(userEntity.getId())
                                .email(userEntity.getEmail())
                                .build())
                .orElse(null);
    }
}
