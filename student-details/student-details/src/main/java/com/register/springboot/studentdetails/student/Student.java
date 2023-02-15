package com.register.springboot.studentdetails.student;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

//Database (MySQL) 
//Static List of todos => Database (H2, MySQL)
@Entity
public class Student {
 public Student() {
	 
 }
	public Student(int id,String username, String studentName, String qualification, LocalDate dueDate, boolean completed) {
		super();
		this.id = id;
		this.username = username;
		this.studentName = studentName;
		this.qualification = qualification;
		this.dueDate = dueDate;
		this.completed = completed;
	}
    @Id
    @GeneratedValue
	private int id;
	private String username;
	@Size
	private String studentName;
	@Size
	private String qualification;
	private LocalDate dueDate;
	private boolean completed;

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public LocalDate getDueDate() {
		return dueDate;
	}


	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}


	public boolean isCompleted() {
		return completed;
	}


	public void setCompleted(boolean completed) {
		this.completed = completed;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", studentName=" + studentName + ", qualification="
				+ qualification + ", dueDate=" + dueDate + ", completed=" + completed + "]";
	}


	
	

}