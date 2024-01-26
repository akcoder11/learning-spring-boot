package com.luv2code.cruddemo.DAO;

import java.util.List;

import com.luv2code.cruddemo.entity.Student;

public interface StudentDAO {
    
    void save(Student thStudent);

    //FOR FINDING STUDENT DATA FROM TABLE
    Student findById(Integer id);

    // Find all the student 
    List<Student> findAll();

    // Find by the last Name
    List<Student> findByLastName(String theLastName);

    void update(Student theStudent);

    void delete(Integer id);

    int deleteAll();
}
