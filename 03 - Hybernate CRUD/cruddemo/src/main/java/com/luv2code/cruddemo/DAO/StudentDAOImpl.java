package com.luv2code.cruddemo.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.cruddemo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO {

    private EntityManager entityManager;
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void save(Student thStudent) {
     
        entityManager.persist(thStudent);
    }

    // we find the student data from table
    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findAll() {
        //Create the query
        TypedQuery<Student> theQuery = entityManager.createQuery("From Student order by lastName desc", Student.class);
        /*   FROM Student 
             ORDER BY lastName DSEC/ASC
        */
        //return the query
        return theQuery.getResultList();
    }
    @Override
    public List<Student> findByLastName(String theLastName) {
        TypedQuery<Student> theQuery = entityManager.createQuery(
            "FROM Student WHERE lastName =:theData", Student.class);
            theQuery.setParameter("theData", theLastName);
        return theQuery.getResultList();
    }
    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }
    @Override
    @Transactional
    public void delete(Integer id) {
        Student theStudent = entityManager.find(Student.class, id);
        entityManager.remove(theStudent);
        
    }
    @Override
    @Transactional
    public int deleteAll() {
        int numRowDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();

        return numRowDeleted;
    }
    
}
