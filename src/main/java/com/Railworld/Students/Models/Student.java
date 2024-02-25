package com.Railworld.Students.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String studentName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "universityId")
    private University university;
}
