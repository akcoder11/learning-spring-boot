package com.luv2code.springboot.cruddemo.dao;


import com.luv2code.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {
    java.util.List<Employee> findAll();
}
