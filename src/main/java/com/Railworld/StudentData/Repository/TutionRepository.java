package com.Railworld.StudentData.Repository;

import com.Railworld.StudentData.Model.Tution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutionRepository extends JpaRepository<Tution,Long> {

}
