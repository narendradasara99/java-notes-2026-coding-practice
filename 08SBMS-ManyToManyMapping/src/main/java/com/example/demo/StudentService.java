package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student save(Student student) {
        return studentRepo.save(student);
    }
}
