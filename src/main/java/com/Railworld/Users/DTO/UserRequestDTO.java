package com.Railworld.Users.DTO;

import com.Railworld.Users.Models.Course;
import lombok.Data;

import java.util.List;

@Data
public class UserRequestDTO {
    private String userName;
    private List<String> courseNames;
}
