package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.entity.Student;
import com.repository.StudentRepository;

@SpringBootApplication
@Component
public class StudentManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository; 

	@Override
	public void run(String... args) throws Exception {
		
		Student student1 = new Student("Sarika", "Kamble" , "sarika@gmail.com");
		studentRepository.save(student1);

		Student student2 = new Student("Trupti", "Kadam" , "trupti@gmail.com");
		studentRepository.save(student2);

		Student student3 = new Student("Shraddha", "Kamble" , "shraddha@gmail.com");
		studentRepository.save(student3);
		
	}

}
