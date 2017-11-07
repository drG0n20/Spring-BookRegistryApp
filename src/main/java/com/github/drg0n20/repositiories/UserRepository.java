package com.github.drg0n20.repositiories;

import com.github.drg0n20.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findOneByUsername(String username);
}