package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserDtls;

import java.util.Optional;

public interface userRepository extends JpaRepository<UserDtls,Integer>
{
//    Optional<UserDtls> findByEmailAndPassword(String email, String password);

    Optional<UserDtls> findByEmail(String email);

}