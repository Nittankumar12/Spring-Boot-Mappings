package com.Railworld.Users.Services;

import com.Railworld.Users.DTO.CourseRequestDTO;
import com.Railworld.Users.Models.Course;

public interface CourseService {
    Course addCoursesWithUsers(CourseRequestDTO courseRequestDTO);
}

