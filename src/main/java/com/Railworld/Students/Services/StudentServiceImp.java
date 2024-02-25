package com.Railworld.Students.Services;

import com.Railworld.Students.Models.Student;
import com.Railworld.Students.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentServiceInterface{
    @Autowired
    public StudentRepository studentRepository;
    @Override
    public List<Student> addStudents(List<Student> studentList) {
        return  studentRepository.saveAll(studentList);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
