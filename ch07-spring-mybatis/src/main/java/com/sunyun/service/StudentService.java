package com.sunyun.service;

import com.sunyun.domain.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    List<Student> queryStudent();
}
