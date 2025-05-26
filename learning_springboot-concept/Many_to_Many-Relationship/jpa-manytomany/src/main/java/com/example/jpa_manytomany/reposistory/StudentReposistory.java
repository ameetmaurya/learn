package com.example.jpa_manytomany.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa_manytomany.entity.student;

public interface StudentReposistory extends JpaRepository<student,Long>{

}
