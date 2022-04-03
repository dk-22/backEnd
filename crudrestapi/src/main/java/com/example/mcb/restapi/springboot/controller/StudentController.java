package com.example.mcb.restapi.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mcb.restapi.springboot.entity.Student;
import com.example.mcb.restapi.springboot.repository.IStudentRepo;

@RestController
public class StudentController {

    @Autowired
    IStudentRepo studentRepo;

    @GetMapping(value = "/student")
    public ResponseEntity<List<Student>> showAllStudent() {
        return ResponseEntity.ok(studentRepo.findAll());
    }

    @GetMapping(value = "/student/{id}")
    public Student studentById(@PathVariable long id) {
        return studentRepo.findById(id).get();
    }

    @PostMapping(value = "/poststudent")
    public void addstudent(@RequestBody Student student){
        student.getMarks().forEach(m -> m.setStudent(student));
        studentRepo.save(student);}

    @DeleteMapping(value = "/student/{id}")
    public void deleteStudent(@PathVariable long id) { studentRepo.deleteById(id); }
}
