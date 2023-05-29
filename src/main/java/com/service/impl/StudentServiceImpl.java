package com.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import com.repository.StudentRepository;
import com.entity.Student;
import com.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl(com.repository.StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

}
