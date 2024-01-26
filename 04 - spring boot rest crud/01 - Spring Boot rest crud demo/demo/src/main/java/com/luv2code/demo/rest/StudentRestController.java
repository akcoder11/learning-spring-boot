package com.luv2code.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.demo.entity.Student;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;
    
    // define @PostConstruct to load the student data
    @PostConstruct
    public void loadData(){
        
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Poornima", "Patel"));
        theStudents.add(new Student("Soni", "Mahiwal"));
        theStudents.add(new Student("Marrio", "Rossi"));
        theStudents.add(new Student("Marry", "Smith"));
    }
    
    @GetMapping("/students")
    public List<Student> getStudents(){
        
        return theStudents;
    }

    //define endpoint or /students/{studentId} retrive student by Id
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        if (studentId>=theStudents.size() || (studentId<0)){
            throw new StudentNotFoundException("Student id not found - ");
        }
        return theStudents.get(studentId);
    }
}