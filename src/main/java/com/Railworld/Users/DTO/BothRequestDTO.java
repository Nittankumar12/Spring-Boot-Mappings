package com.Railworld.Users.DTO;

import lombok.Data;

import java.util.List;

@Data
public class BothRequestDTO {
    private List<String> users;
    private List<String> courses;
}
