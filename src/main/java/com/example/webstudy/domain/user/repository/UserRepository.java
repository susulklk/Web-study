package com.example.realworld.domain.user.repository;

/**
 * @Author：LC
 * @Package：com.example.realworld.domain.user.repository
 * @Project：realworld-springboot
 * @name：UserRepository
 * @Date：2023/10/8 15:05
 * @Filename：UserRepository
 */
import com.example.realworld.domain.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    @Query("SELECT u FROM UserEntity u WHERE u.username = :username OR u.email = :email")
    List<UserEntity> findByUsernameOrEmail(@Param("username") String username, @Param("email") String email);

    Optional<UserEntity> findByEmail(String email);

    Optional<UserEntity> findByUsername(String username);
}