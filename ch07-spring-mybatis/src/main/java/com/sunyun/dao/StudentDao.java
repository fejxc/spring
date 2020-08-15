package com.sunyun.dao;

import com.sunyun.domain.Student;

import java.util.List;

public interface StudentDao {

    int insertStudent(Student student);
    List<Student> selectStudents();

}
