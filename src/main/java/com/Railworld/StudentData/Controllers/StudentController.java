package com.Railworld.StudentData.Controllers;

import com.Railworld.StudentData.Model.Student;
import com.Railworld.StudentData.Model.Tution;
import com.Railworld.StudentData.Repository.StudentRepository;
import com.Railworld.StudentData.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentService studentService;
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @PostMapping
    public Student addStudent(@RequestBody Student student){
         return studentService.addStudent(student);
    }
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,@RequestBody Student student){
        return studentService.updateStudent(id,student);
    }
}
