package com.Railworld.Students.Controllers;

import com.Railworld.Students.DTO.UniversityRequestDTO;
import com.Railworld.Students.Models.University;
import com.Railworld.Students.Repositories.UniversityRepository;
import com.Railworld.Students.Services.UniversityServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/university")
public class UniversityController {
    @Autowired
    private UniversityRepository universityRepository;
    @Autowired
    private UniversityServiceImp universityServiceImp;

//    @PostMapping
//    public University addUniversity(University university){
//        return universityServiceImp.addUniversity(university);
//    }

    @PostMapping("/addWithStudents")
    public University addUniversityAndStudents(@RequestBody UniversityRequestDTO universityRequestDTO){
        return universityServiceImp.addUniversityAndStudents(universityRequestDTO);
    }

}
