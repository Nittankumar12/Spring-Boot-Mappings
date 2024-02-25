package com.Railworld.Users.Services;

import com.Railworld.Users.DTO.UserRequestDTO;
import com.Railworld.Users.Models.User;

public interface UserService {
    User getUser(Long id);
    User addUsersWithCourses(UserRequestDTO userRequestDTO);
}
