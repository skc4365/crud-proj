package com.skc.crud_proj.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skc.crud_proj.domain.Student;
import com.skc.crud_proj.service.StudentService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("api/students")
@RequiredArgsConstructor
public class StudentRestController {
	
	private final StudentService studentService;
	
	@GetMapping
	public List<Student> list() {
		return studentService.getAllStudents();
	}
	

}
