package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.app.entity.Student;
import com.example.app.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		
		
		SpringApplication.run(StudentManagementProjectApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;//injecting bcz we have to use Student rep methods
	@Override
	public void run(String... args) throws Exception {

		
		/*
		 * Student student1=new Student("Parvez", "Khan", "parvez.khan1@dummy.com");
		 * studentRepository.save(student1); Student student2=new Student("Aafreen",
		 * "Khan", "aafreen.khan1@dummy.com"); //studentRepository.save(student2);
		 * Student student3=new Student("Firoz", "Khan", "firoz.khan1@dummy.com");
		 * studentRepository.save(student3); Student student4=new Student("Noor",
		 * "Sheikh", "noor.sheikh1@dummy.com"); //studentRepository.save(student4);
		 * Student student5=new Student("Shahana", "Sheikh", "shana.sheikh1@dummy.com");
		 * studentRepository.save(student5);
		 */
		 
	
	
	}

}
