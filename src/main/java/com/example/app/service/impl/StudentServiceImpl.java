package com.example.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.app.entity.Student;
import com.example.app.repository.StudentRepository;
import com.example.app.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {//SPRing bean has only one constr so avoid using Auto wired annot

private StudentRepository studentRepository;//CONSTR BASED DEP INJECT TO INJECT DEPENDENCIES 
	
	public StudentServiceImpl(StudentRepository studentRepository) {
	
		super();
		this.studentRepository=studentRepository;
	}

	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();//studentRep provides all crud methods
	}


	@Override
	public Student saveStudent(Student student) {
 		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

}
