package com.subhajit.SbOpenApi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.subhajit.SbOpenApi.openapi.api.StudentApi;
import com.subhajit.SbOpenApi.openapi.model.SaveStudent;
import com.subhajit.SbOpenApi.openapi.model.Student;





@RestController
public class TestController implements StudentApi{

	public ResponseEntity<Student> getStudent(Integer studentId, String studentName){
		Student student = new Student();
		student.setStduentId(1L);
		student.setStudentName(null);
		 return new ResponseEntity<>(student, HttpStatus.OK);
	}
	
	public ResponseEntity<Student> saveStudent(Integer studentId, SaveStudent saveStudent) {
		System.out.println("See -> " + saveStudent.getStudentId() + " - " + saveStudent.getStudentName());
		Student student = new Student();
		student.setStduentId(1L);
		student.setStudentName("XXX");
		 return new ResponseEntity<>(student, HttpStatus.OK);
	}
	
}
