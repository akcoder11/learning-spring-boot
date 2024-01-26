package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{
     //define field for entityManager
        EntityManager entityManager;
        //define constructor injection
       // EmployeeDAOJpaImpl(){}
        @Autowired
        EmployeeDAOJpaImpl(EntityManager entityManager){
            this.entityManager=entityManager;
        }
    @Override
    public List<Employee> findAll() {
       //Create Query 
       System.out.println("hi spring boot learner1");
              System.out.println("hi spring boot learner1");
       System.out.println("hi spring boot learner1");
       System.out.println("hi spring boot learner1");

        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);
       System.out.println("hi spring boot learner2");
       System.out.println("hi spring boot learner2");

       // execute query and get result
        List<Employee> employees=theQuery.getResultList();
       System.out.println("hi spring boot learner3");
       System.out.println("hi spring boot learner3");
       System.out.println("hi spring boot learner3");

       //return the result
        return employees;
    }
    
}
