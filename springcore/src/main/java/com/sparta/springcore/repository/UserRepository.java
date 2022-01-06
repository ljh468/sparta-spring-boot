package com.sparta.springcore.repository;

import com.sparta.springcore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // 일반 사용자 ID 중복확인
    Optional<User> findByUsername(String username);

    // 카카오 ID 중복확인
    Optional<User> findByKakaoId(Long kakaoId);

    // 카카오 이메일 중복확인
    Optional<User> findByEmail(String email);

}