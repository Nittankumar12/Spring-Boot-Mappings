package com.Railworld.Students.Repositories;

import com.Railworld.Students.Models.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends JpaRepository<University,Long> {

}
