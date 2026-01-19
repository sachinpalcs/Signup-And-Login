package com.project.signupandlogin.Signup.and.Login.repository;

import com.project.signupandlogin.Signup.and.Login.entity.User;

public class UserRepositoryUserRepository {
    Optional<User> findByEmail(String email);
}
