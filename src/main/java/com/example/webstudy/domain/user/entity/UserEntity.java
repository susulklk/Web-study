package com.example.realworld.domain.user.entity;

/**
 * @Author：LC
 * @Package：com.example.realworld.domain.user.entity
 * @Project：realworld-springboot
 * @name：UserEntity
 * @Date：2023/10/8 15:03
 * @Filename：UserEntity
 */

import com.example.realworld.domain.entity.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column
    private String bio;
    @Column
    private String image;

    @Builder
    public UserEntity(Long id, String username, String email, String password, String bio, String image) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.bio = bio;
        this.image = image;
    }
}