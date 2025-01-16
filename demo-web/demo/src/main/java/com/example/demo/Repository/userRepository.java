package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserDtls;

public interface userRepository extends JpaRepository<UserDtls,Integer>{

}
