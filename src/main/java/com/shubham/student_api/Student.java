package com.shubham.student_api;

import jakarta.persistence.*;

@Entity                          // tells JPA: make a DB table for this class
@Table(name = "students")        // table name in MySQL
public class Student {

    @Id                          // this is the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto-increment
    private Long id;

    private String name;
    private String email;
    private String branch;

    // Constructors
    public Student() {}

    public Student(String name, String email, String branch) {
        this.name = name;
        this.email = email;
        this.branch = branch;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getBranch() { return branch; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setBranch(String branch) { this.branch = branch; }
}