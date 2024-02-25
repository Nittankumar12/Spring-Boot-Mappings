package com.Railworld.Students.Services;

import com.Railworld.Students.DTO.UniversityRequestDTO;
import com.Railworld.Students.Models.Student;
import com.Railworld.Students.Models.University;
import com.Railworld.Students.Repositories.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UniversityServiceImp implements  UniversityServiceInterface{

    @Autowired
public UniversityRepository universityRepository;
//    @Override
//    public University addUniversity(University university) {
//        return universityRepository.save(university);
//    }

    @Override
    public University addUniversityAndStudents(UniversityRequestDTO universityRequestDTO){
        University university = new University();
        university.setUniversityName(universityRequestDTO.getUniversityName());

        List<Student> studentList = new ArrayList<>();
        for(String studentName: universityRequestDTO.getStudentNames()){
            Student student = new Student();
            student.setStudentName(studentName);
            student.setUniversity(university);
            studentList.add(student);
        }
        university.setStudentsList(studentList);
        return  universityRepository.save(university);
    }
//
}
