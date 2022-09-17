package com.school.school.Controller;

import com.school.school.Entity.Student;
import com.school.school.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/save-student")
    public String saveStudent(@RequestBody final Student student){
        return studentService.saveStudent(student);
    }

}
