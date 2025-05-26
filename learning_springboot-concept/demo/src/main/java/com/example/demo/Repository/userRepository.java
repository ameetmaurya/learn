package com.example.demo.Repository;

import com.example.demo.Model.UserDtls;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface userRepository extends JpaRepository<UserDtls,Integer>
    {

        Optional<UserDtls> findByEmail(String email);
    }

