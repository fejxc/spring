package com.sunyun.service;

import com.sunyun.dao.StudentDao;
import com.sunyun.domain.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    //引用类型
    private StudentDao studentDao;
    //使用set注入赋值
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
       int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> queryStudent() {
        List<Student> students = studentDao.selectStudents();

        return students;
    }
}
