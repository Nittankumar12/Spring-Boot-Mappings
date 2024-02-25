package com.Railworld.Users.Services;


import com.Railworld.Users.DTO.UserRequestDTO;
import com.Railworld.Users.Models.Course;
import com.Railworld.Users.Models.User;
import com.Railworld.Users.Repositories.CourseRepository;
import com.Railworld.Users.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public User getUser(Long id){
         return userRepository.getById(id);
    }

    @Override
    public User addUsersWithCourses(UserRequestDTO userRequestDTO) {
        User user = userRepository.findUserByUserName(userRequestDTO.getUserName());
        if(user == null){
            user = new User();
            user.setUserName(userRequestDTO.getUserName());
        }
//
//        user.setUserName(userRequestDTO.getUserName());

        for (String courseName : userRequestDTO.getCourseNames()) {
            Course course = courseRepository.findCourseByCourseName(courseName);
            if (course == null) {
                course = new Course();
                course.setCourseName(courseName);
                course = courseRepository.save(course);
            }

            if (!course.getUsers().contains(user)) {
                course.addUser(user);
                courseRepository.save(course);
            }
        }
        return userRepository.save(user);


//        List<Course> courseList = user.getCourses();
//        if (courseList == null) {
//            courseList = new ArrayList<>();
//        }
//        for(String courseName: userRequestDTO.getCourseNames()){
//            Course course = courseRepository.findCourseByCourseName(courseName);
//            if (course == null) {
//                course = new Course();
//                course.setCourseName(courseName);
//                courseRepository.save(course);
//            }
//            courseList.add(course);
//        }
//        user.setCourses(courseList);
//        return userRepository.save(user);
    }
}

