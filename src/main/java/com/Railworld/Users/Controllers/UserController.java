package com.Railworld.Users.Controllers;

import com.Railworld.Users.DTO.BothRequestDTO;
import com.Railworld.Users.DTO.UserRequestDTO;
import com.Railworld.Users.Models.User;
import com.Railworld.Users.Repositories.UserRepository;
import com.Railworld.Users.Services.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserServiceImp userServiceImp;

    @GetMapping
    public User getUser(@PathVariable Long id){
        return userServiceImp.getUser(id);
    }

    @PostMapping
    public User addUsersWithCourses(@RequestBody UserRequestDTO userRequestDTO){
        return userServiceImp.addUsersWithCourses(userRequestDTO);
    }
    @PostMapping("/both")
    public ResponseEntity<String> addBoth(@RequestBody BothRequestDTO bothRequestDTO){
        userServiceImp.addBoth(bothRequestDTO);
        return ResponseEntity.ok("Chal gaya!!");
    }

}
