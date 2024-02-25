package com.Railworld.StudentData.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Tution {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int tutionId;
private double tutionFee;
@OneToOne(mappedBy = "tution")
    private  Student student;
}
