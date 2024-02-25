package com.Railworld.Students.Services;

import com.Railworld.Students.Models.Student;

import java.util.List;

public interface StudentServiceInterface {
    List<Student> addStudents(List<Student> studentList);
    List<Student> getAllStudents();
}
