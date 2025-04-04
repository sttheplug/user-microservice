package com.userservice.userservice.repository;

import com.userservice.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    User getByUsername(String username);
    boolean existsByUsername(String username);

}
