package com.skc.crud_proj.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.skc.crud_proj.domain.Student;

@Service
public class StudentService {

//	public List<Student> getAllStudents() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	public List<Student> getAllStudents() {
		
//		DB연결전에 테스트
		List<Student> students = new ArrayList<>();
		students.add(new Student() {{setId(1L); setName("홍길동");}});
		students.add(new Student() {{setId(2L); setName("이몽룡");}});
		students.add(new Student() {{setId(3L); setName("성춘향");}});
		return students;
	}

}
