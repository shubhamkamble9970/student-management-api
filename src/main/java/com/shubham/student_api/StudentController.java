
package com.shubham.student_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")   // all URLs in this class start with /students
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired                 // Spring injects the repository automatically
    private StudentRepository repo;

    // GET /students → returns all students
    @GetMapping
    public List<Student> getAll() {
        return repo.findAll();
    }

    // GET /students/1 → returns student with id=1
    @GetMapping("/{id}")
    public Student getOne(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    // POST /students → adds a new student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return repo.save(student);
    }
    // PUT /students/1 → update student with id=1
@PutMapping("/{id}")
public Student updateStudent(@PathVariable Long id, @RequestBody Student updated) {
    Student existing = repo.findById(id).orElse(null);
    if (existing == null) return null;

    existing.setName(updated.getName());
    existing.setEmail(updated.getEmail());
    existing.setBranch(updated.getBranch());

    return repo.save(existing);   // save() updates if ID already exists
}

// DELETE /students/1 → delete student with id=1
@DeleteMapping("/{id}")
public String deleteStudent(@PathVariable Long id) {
    repo.deleteById(id);
    return "Student deleted successfully";
}

}