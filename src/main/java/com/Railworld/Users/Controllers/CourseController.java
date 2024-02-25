package com.Railworld.Users.Controllers;

import com.Railworld.Users.DTO.CourseRequestDTO;
import com.Railworld.Users.Models.Course;
import com.Railworld.Users.Repositories.CourseRepository;
import com.Railworld.Users.Services.CourseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private CourseServiceImp courseServiceImp;

    @PostMapping
    public Course addCoursesWithUsers(@RequestBody CourseRequestDTO courseRequestDTO){
        return courseServiceImp.addCoursesWithUsers(courseRequestDTO);
    }
}

