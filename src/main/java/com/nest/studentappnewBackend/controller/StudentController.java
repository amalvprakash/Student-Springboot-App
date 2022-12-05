package com.nest.studentappnewBackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String Hompage(){
        return  "hello world!";
    }

    @GetMapping("/contact")
    public String Contact(){
        return "Welcome to contact page";
    }

    @GetMapping("/gallery")
    public String Gallery(){
        return "welcome to gallery!!";
    }

    @GetMapping("/home")
    public String Home(){
        return "welcome to home page";
    }
}
