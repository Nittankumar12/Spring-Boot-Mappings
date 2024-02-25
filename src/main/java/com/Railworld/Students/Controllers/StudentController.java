package com.Railworld.Students.Controllers;

import com.Railworld.Students.Models.Student;
import com.Railworld.Students.Repositories.StudentRepository;
import com.Railworld.Students.Services.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentServiceImp studentServiceImp;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentServiceImp.getAllStudents();
    }
    @PostMapping
    public List<Student> addStudents(@RequestBody List<Student> Students){
        return studentServiceImp.addStudents(Students);
    }
}
