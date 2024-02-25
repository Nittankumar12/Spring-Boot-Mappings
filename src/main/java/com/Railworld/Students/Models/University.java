package com.Railworld.Students.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int universityId;
    private String universityName;

    @OneToMany(mappedBy = "university",cascade = CascadeType.ALL)
    private List<Student> studentsList;
}
