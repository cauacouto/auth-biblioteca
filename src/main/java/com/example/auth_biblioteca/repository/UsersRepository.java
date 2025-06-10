package com.example.auth_biblioteca.repository;

import com.example.auth_biblioteca.Users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsersRepository extends JpaRepository<User, Long> {

    UserDetails findByLogin(String login);

    boolean existsByLogin(String login);

}
