package com.Railworld.Users.Repositories;

import com.Railworld.Users.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
    Course findCourseByCourseName(String courseName);
}
