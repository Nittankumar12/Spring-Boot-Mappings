package com.Railworld.StudentData.Services;

import com.Railworld.StudentData.Model.Tution;

import java.util.List;

public interface TutionServiceInterface {
List<Tution> getAllTutions();
Tution addTution(Tution tution);
Tution updateTution(Long id, Tution tution);

}
