package com.nest.studentappnewBackend.controller;

import com.nest.studentappnewBackend.DAo.StudentDAO;
import com.nest.studentappnewBackend.Model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
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
    public HashMap<String, String> AddStudents(@RequestBody Students s){
        System.out.println(s.getName().toString());
        dao.save(s);
        HashMap<String, String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }

    @GetMapping("/viewStudents")
    public List<Students> ViewStudents(){
        return (List<Students>) dao.findAll();
    }

    @PostMapping(path = "/search", consumes = "application/json", produces = "application/json")
    public List<Students> Search(@RequestBody Students s){
        return (List<Students>) dao.Search(s.getRollNO());
    }
    @PostMapping(path = "/delete", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> Delete(@RequestBody Students s){
    dao.Delete(s.getRollNO());
    HashMap<String,String> map = new HashMap<>();
    map.put("status","success");
    return map;
    }
}
