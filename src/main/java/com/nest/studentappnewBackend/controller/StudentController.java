package com.nest.studentappnewBackend.controller;

import com.nest.studentappnewBackend.DAo.StudentDAO;
import com.nest.studentappnewBackend.Model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentDAO dao;
    @GetMapping("/")
    public String Hompage(){
        return  "hello world!";
    }

    @PostMapping( path = "/addStudents", consumes = "application/json", produces = "application/json")
    public String AddStudents(@RequestBody Students s){
        System.out.println(s.getName().toString());
        return "Add Student";
    }

    @GetMapping("/viewStudents")
    public List<Students> ViewStudents(){
        return (List<Students>) dao.findAll();
    }
}
