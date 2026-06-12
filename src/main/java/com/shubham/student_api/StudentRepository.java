package com.shubham.student_api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // You get findAll(), findById(), save(), deleteById() for FREE
    // No SQL needed. Spring writes it for you.
}