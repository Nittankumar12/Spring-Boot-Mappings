package com.Railworld.StudentData.Services;

import com.Railworld.StudentData.Model.Student;

import java.util.List;

public interface StudentServiceInterface {
    List<Student> getAllStudents();
    Student addStudent(Student student);
    Student updateStudent(Long id, Student updatedStudent);
}
