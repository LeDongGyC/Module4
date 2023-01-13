package com.example.service.impl;

import com.example.model.Student;
import com.example.repository.IStudentRepo;
import com.example.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepo studentRepo;
    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }
}
