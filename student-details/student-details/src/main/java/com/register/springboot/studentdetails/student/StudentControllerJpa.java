package com.register.springboot.studentdetails.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class StudentControllerJpa {
	
	public StudentControllerJpa(StudentService studentService, StudentRepository studentRepository) {
		super();
//		this.studentService = studentService;
		this.studentRepository = studentRepository;

	}

//	private StudentService studentService;
	private StudentRepository studentRepository;
	
	
	@RequestMapping("list-students")
	public String listAllStudents(ModelMap model) {
		String username = getLoggedInUsername(model);
		List<Student> students = studentRepository.findByUsername(username);
		model.addAttribute("students", students);
		return "listStudents";
	}


	
	

	//GET, POST
	@RequestMapping(value="add-student", method = RequestMethod.GET)
	public String showNewStudentPage(ModelMap model) {
		String username = getLoggedInUsername(model);
		Student student = new Student(0,username, "", "", LocalDate.now().plusYears(1), false);
		model.put("student", student);
		return "student";
	}

	@RequestMapping(value="add-student", method = RequestMethod.POST)
	public String addNewStudent(ModelMap model,@Valid Student student , BindingResult result) {
//		String studentName = (String)model.get("name");
		if(result.hasErrors()) {
			return "student";
		}
		String username = getLoggedInUsername(model);
		student.setUsername(username);
		studentRepository.save(student);
//		StudentService.addStudent(username,student.getStudentName(), student.getQualification(), 
//				student.getDueDate(), student.isCompleted());
		return "redirect:list-students";
	}
	@RequestMapping("delete-student")
	public String deleteTodo(@RequestParam int id) {
		//Delete todo
		studentRepository.deleteById(id);
//		StudentService.deleteById(id);
		return "redirect:list-students";
		
	}

	@RequestMapping(value="update-student", method = RequestMethod.GET)
	public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
		Student student = studentRepository.findById(id).get();
		model.addAttribute("student", student);
		return "student";
	}
	@RequestMapping(value="update-student", method = RequestMethod.POST)
	public String updateStudent(ModelMap model, @Valid Student student, BindingResult result) {
		
		if(result.hasErrors()) {
			return "student";
		}
		String username = getLoggedInUsername(model);
		student.setUsername(username);
		studentRepository.save(student);
//		studentService.updateStudent(student);
		return "redirect:list-students";
	}
	private String getLoggedInUsername(ModelMap model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}

}