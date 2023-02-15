package com.register.springboot.studentdetails.student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	public List<Student> findByUsername(String username);

}
