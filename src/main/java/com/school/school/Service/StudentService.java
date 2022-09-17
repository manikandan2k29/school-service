package com.school.school.Service;

import com.school.school.Entity.Student;
import com.school.school.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.persistence.Access;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    public String saveStudent(Student student) {
        Student checkStudent = studentRepository.findByStudentId(student.getStudentId());
        if (!ObjectUtils.isEmpty(student)&&ObjectUtils.isEmpty(checkStudent)){
            studentRepository.save(student);
            return "Student saved";
        }
        return "Student already exists";
    }
}
