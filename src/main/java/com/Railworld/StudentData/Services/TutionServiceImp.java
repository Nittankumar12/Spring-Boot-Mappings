package com.Railworld.StudentData.Services;

import com.Railworld.StudentData.Model.Student;
import com.Railworld.StudentData.Model.Tution;
import com.Railworld.StudentData.Repository.TutionRepository;

import java.util.List;
import java.util.Optional;

public class TutionServiceImp implements  TutionServiceInterface{
private TutionRepository tutionRepository;

    @Override
    public List<Tution> getAllTutions() {
        return tutionRepository.findAll();
    }

    @Override
    public Tution addTution(Tution tution) {
        return tutionRepository.save(tution);
    }
    @Override
    public Tution updateTution(Long id, Tution updatedTution){
        Optional<Tution> optionalTution = tutionRepository.findById(id);
        if(optionalTution.isPresent()){
            Tution tution  = optionalTution.get();
            tution.setTutionFee(updatedTution.getTutionFee());
            return tutionRepository.save(tution);
        }else{
            throw  new RuntimeException("Tution not found with id: " + id);
        }
    }
}
