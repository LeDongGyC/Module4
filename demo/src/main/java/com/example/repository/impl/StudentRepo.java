package com.example.repository.impl;

import com.example.model.Student;
import com.example.repository.IStudentRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo implements IStudentRepo {
    private static List<Student> studentList;
    static {
        studentList = new ArrayList<>();
        studentList.add(new Student(1,"Dong1"));
        studentList.add(new Student(2,"Dong2"));
        studentList.add(new Student(3,"Dong3"));
        studentList.add(new Student(4,"Dong4"));
    }
    @Override
    public List<Student> findAll() {
        return studentList;
    }
}
