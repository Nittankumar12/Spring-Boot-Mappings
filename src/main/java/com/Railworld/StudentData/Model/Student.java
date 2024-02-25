package com.Railworld.StudentData.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;

    @OneToOne(cascade =  CascadeType.ALL)
    @JoinColumn(name = "fk_tution_id")
    private Tution tution;
}
