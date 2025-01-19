package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.app.entity.Student;
import com.example.app.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;
	
	public StudentController(StudentService studentService) {//constructor// one constr hence omit autowired annot
		
		
		this.studentService=studentService;
	}
	
	//handler meth  to handle list  students request and return and model n view

	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());//doubt on this step
		return "students"; 
		
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		//create student obj to hold  studnet form data
		Student student=new Student();
		
		model.addAttribute("student",student);
		return "create_student";	
		
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudent(@PathVariable Long id, Model model) {
		model.addAttribute("student",studentService.getStudentById(id));
		return "edit_students";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
		
		//get stu from DB by id
		
		Student existingStudent=studentService.getStudentById(id);
		existingStudent.setId(student.getId());
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		//save updated stu object
		studentService.updateStudent(existingStudent);
		return "redirect:/students";
			
	}
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		
		studentService.deleteStudentById(id);
		return "redirect:/students";
		
		
	}
		

}
