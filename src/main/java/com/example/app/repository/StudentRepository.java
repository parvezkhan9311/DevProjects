package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
