package com.Railworld.StudentData.Services;


import com.Railworld.StudentData.Model.Student;
import com.Railworld.StudentData.Model.Tution;
import com.Railworld.StudentData.Repository.StudentRepository;
import com.Railworld.StudentData.Repository.TutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements  StudentServiceInterface {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TutionRepository tutionRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }
    public Student updateStudent(Long id, Student updatedStudent) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        Student student = optionalStudent.get();
        Tution tution = student.getTution();
        tution.setTutionFee(updatedStudent.getTution().getTutionFee());
        student.setTution(tution);
        return studentRepository.save(student);
//        if (optionalStudent.isPresent()) {
//            Student student = optionalStudent.get();
//            Tution tution = updatedStudent.getTution();
//            if (tution != null) {
//                student.setTution(tution);
//            } else {
//                throw new RuntimeException("Tution informataion required for updation of student with id: " + id);
//            }
//            return studentRepository.save(student);
//        }
//        else{
//            throw new RuntimeException("Student not found with id: " + id);
//        }
    }
}

