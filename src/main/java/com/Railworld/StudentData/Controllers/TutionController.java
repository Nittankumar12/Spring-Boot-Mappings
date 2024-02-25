package com.Railworld.StudentData.Controllers;

import com.Railworld.StudentData.Model.Tution;
import com.Railworld.StudentData.Repository.StudentRepository;
import com.Railworld.StudentData.Services.StudentService;
import com.Railworld.StudentData.Services.TutionServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/tutions")
public class TutionController {
    @Autowired
    private TutionServiceImp tutionServiceImp;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    StudentService studentService;
    @GetMapping
    public List<Tution> getAllTutions(){
        return tutionServiceImp.getAllTutions();
    }
    @PostMapping
    public Tution addTution(@RequestBody Tution tution){
        return tutionServiceImp.addTution(tution);
    }
    @PutMapping
    public Tution updateTution(@PathVariable Long id,@RequestBody Tution tution){
        return tutionServiceImp.updateTution(id,tution);
    }

}
