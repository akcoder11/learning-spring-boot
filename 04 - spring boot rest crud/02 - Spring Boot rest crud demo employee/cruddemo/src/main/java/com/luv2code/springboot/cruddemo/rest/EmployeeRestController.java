package com.luv2code.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api")
public class EmployeeRestController {
  private EmployeeService employeeService;

public EmployeeRestController(EmployeeService employeeService) {
    this.employeeService = employeeService;
}

@GetMapping("/employees")
public List<Employee> findAll(){
    return employeeService.findAll();
}
    
}