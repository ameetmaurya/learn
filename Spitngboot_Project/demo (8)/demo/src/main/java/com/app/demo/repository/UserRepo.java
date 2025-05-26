package com.app.demo.repository;

import com.app.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {

    User findByUsernameAndPassword(String username,String password);

    boolean existsByUsername(String username);
}
