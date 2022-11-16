package WorkShop_GDSC.esprit.tn.controller;


import WorkShop_GDSC.esprit.tn.entities.Student;
import WorkShop_GDSC.esprit.tn.services.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("")
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @PostMapping("")
    Student  addStudent(@RequestBody Student student) throws Exception {
        return studentService.add(student);
    }

    @PutMapping("/{id}")
    Student updateStudent(@PathVariable("id") Long id, @RequestBody Student student){
        return studentService.update(id, student);
    }

    @DeleteMapping("/{id}")
    void deleteStudent(@PathVariable("id") Long id){
        studentService.delete(id);
    }

    @GetMapping("/{id}")
    Student findById(@PathVariable("id") Long id){
        return studentService.findById(id);
    }



}
