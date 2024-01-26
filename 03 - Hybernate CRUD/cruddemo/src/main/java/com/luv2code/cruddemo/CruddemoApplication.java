package com.luv2code.cruddemo;


import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.cruddemo.DAO.StudentDAO;
import com.luv2code.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner (StudentDAO studentDAO){
		return runner -> {
			//createStudent(studentDAO);
			 //creating multiple save student data
			//createMultiStudent(studentDAO);
			//readStudent(studentDAO);
			queryForStudent(studentDAO);
			//queryForStudentByLastName(studentDAO);
			 //updateStudent(studentDAO);
			//deleteStudent(studentDAO);
			//deleteAllStudents(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creaating Student object ...");
		Student tempStudent = new Student("paul","Dao","paul@gmail.com");

		System.out.println("Saving the student");
		studentDAO.save(tempStudent);

		System.out.println("Save Student Generated ID: "+tempStudent.getId());
	}

	// saving muti stdent data
	private void createMultiStudent(StudentDAO studentDAO) {
		System.out.println("Creaating Student object ...");
		Student tempStudent1 = new Student("taul","Dao","taul@gmail.com");
		Student tempStudent2 = new Student("maol","Dao","maul@gmail.com");
		Student tempStudent3 = new Student("chaul","Dao","chaul@gmail.com");

		System.out.println("Saving the student");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}
	
	private void readStudent(StudentDAO studentDAO) {
		//create student data first
		System.out.println("creating Student Object");
		Student tempStudent = new Student("Ron","Toe","rol@gmail.com");

		//save the student
		System.out.println("saving the student ....");
		studentDAO.save(tempStudent);
		//display the student
		int theId = tempStudent.getId();
		System.out.println("saved student Generated ID: "+theId);
		//retrieve student based on the id: primary key
		System.out.println("Retreving student with id: "+theId);
		Student myStudent = studentDAO.findById(theId);
		//display the student
		System.out.println("Found the student: "+myStudent);

	}

	private void queryForStudent(StudentDAO studentDAO) {
		//get the list of all student
		List<Student> theStudents = studentDAO.findAll();
		// display the student
		for(Student tempStudent:theStudents){
			System.out.println(tempStudent);
		}
	}
	
	private void queryForStudentByLastName(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findByLastName("Dao");
		// display the student
		for(Student tempStudent:theStudents){
			System.out.println(tempStudent);
		}
	}
	
	private void updateStudent(StudentDAO studentDAO) {
		int studentId = 1000;
		System.out.println("Getting Student with id:"+studentId);

		Student myStudent = studentDAO.findById(studentId);
		System.out.println("Updating student ...");
		myStudent.setFirstName("booby");

		studentDAO.update(myStudent);
		System.out.println("Updated Student: "+myStudent);
	}


	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 1003;
		System.out.println("Deleting Student id:"+ studentId);
		studentDAO.delete(studentId);
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		System.out.println("Deleting all Students");
		int numRowDeleted = studentDAO.deleteAll();
		System.out.println("Delete row count: "+numRowDeleted);
	}
}
