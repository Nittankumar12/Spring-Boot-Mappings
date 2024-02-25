package com.Railworld.Students.Services;

import com.Railworld.Students.DTO.UniversityRequestDTO;
import com.Railworld.Students.Models.University;

public interface UniversityServiceInterface {
//    University addUniversity(University university);
    University addUniversityAndStudents(UniversityRequestDTO universityRequestDTO);
}

