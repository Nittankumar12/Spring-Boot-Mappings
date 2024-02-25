package com.Railworld.Users.Services;

import com.Railworld.Users.DTO.CourseRequestDTO;
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
public class CourseServiceImp implements CourseService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public Course addCoursesWithUsers(CourseRequestDTO courseRequestDTO) {

        Course course = courseRepository.findCourseByCourseName(courseRequestDTO.getCourseName());
        if(course == null){
            course = new Course();
            course.setCourseName(courseRequestDTO.getCourseName());
        }

//        List<User> users = new ArrayList<>();
        for (String userName : courseRequestDTO.getUserNames()) {
            User user = userRepository.findUserByUserName(userName);
            if (user == null) {
                user = new User();
                user.setUserName(userName);
                user = userRepository.save(user);
            }

//            user.addCourse(course);
//            course.addUser(user);
            if (!user.getCourses().contains(course)) {
                user.addCourse(course);
                userRepository.save(user);
            }
        }
        return courseRepository.save(course);


//        List<User> userList = course.getUsers();
//        if (userList == null) {
//            userList = new ArrayList<>();
//        }
//        for(String userName: courseRequestDTO.getUserNames()){
//            User user = userRepository.findUserByUserName(userName);
//            if (user == null) {
//                user = new User();
//                user.setUserName(userName);
//                user = userRepository.save(user);
//            }
//            userList.add(user);
//        }
//        course.setUsers(userList);
//        return courseRepository.save(course);
    }
}
