package com.Railworld.Users.DTO;

import lombok.Data;

import java.util.List;

@Data
public class CourseRequestDTO {
    private String courseName;
    private List<String> userNames;
}
