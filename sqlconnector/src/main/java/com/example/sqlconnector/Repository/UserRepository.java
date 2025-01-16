package com.example.sqlconnector.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sqlconnector.Entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
