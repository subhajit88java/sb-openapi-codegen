package com.subhajit.SbOpenApi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.subhajit.SbOpenApi.openapi.api.StudentApi;
import com.subhajit.SbOpenApi.openapi.model.Student;





@RestController
public class TestController implements StudentApi{

	public ResponseEntity<Student> getStudent(String studentId){
		Student student = new Student();
		student.setStduentId(1L);
		student.setStudentName("Subhajit");
		 return new ResponseEntity<>(student, HttpStatus.OK);
	}
	
}
