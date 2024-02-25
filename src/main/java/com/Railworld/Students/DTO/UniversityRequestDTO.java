package com.Railworld.Students.DTO;

import lombok.Data;
import java.util.List;
@Data
public class UniversityRequestDTO {
    private String universityName;
    private List<String> studentNames;
}
