package com.example.jpa_manytomany.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa_manytomany.entity.course;

public interface CourseReposistory extends JpaRepository<course,Long> {

}
