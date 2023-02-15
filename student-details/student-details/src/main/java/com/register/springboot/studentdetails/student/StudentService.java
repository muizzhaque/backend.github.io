package com.register.springboot.studentdetails.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class StudentService {
	
	private static List<Student> students = new ArrayList<>();
	private static int studentsCount =0;
	static {
		students.add(new Student(++studentsCount,"muizz30520", "muizz","Under Grad", 
							LocalDate.now().minusMonths(5), true ));
		students.add(new Student(++studentsCount,"muizz30520", "mujeeb","B.com", 
				LocalDate.now().plusMonths(2), false ));
		students.add(new Student(++studentsCount,"muizz30520", "mumin","Class 5", 
				LocalDate.now().plusMonths(3), false ));
	}

	public List<Student> findByUsername(String username) {
		Predicate<? super Student> predicate = student -> student.getUsername().equalsIgnoreCase(username);
		
		return students.stream().filter(predicate).toList();
	}

	public static void addStudent(String username, String studentName, String qualification, LocalDate dueDate, boolean completed) {
		Student student = new Student(++studentsCount,username,studentName,qualification,dueDate,completed);
		students.add(student);	
		}

	public static void deleteById(int id) {
		Predicate<? super Student> predicate = student -> student.getId() == id;
		students.removeIf(predicate);
	}

	public Student findById(int id) {
		Predicate<? super Student> predicate = student -> student.getId() == id;
		Student student = students.stream().filter(predicate).findFirst().get();
		return student;
	}

	public void updateStudent(@Valid Student student) {
		deleteById(student.getId());
		students.add(student);
	}


	
}