package com.adam;
 import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;

//**** To avoid code mixing MVC with REST code. Class bellow was created *******
//**** With using of @RestController Annotation it is not required to mention @ResponseBody Annotation ***********

@RestController
public class RestControllerApi {
	//**************  Creating a REST service together with Spring MVC  ****************
		//@ResponseBody //Response Body indicates Spring MVC do not use any view technology for displaying
	
		@RequestMapping(value="/students", method = RequestMethod.GET, produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
		public ArrayList<Student> getStudents(){
			Student student = new Student();
		     student.setStudentName("Mark");
		     Student student1 = new Student();
		     student1.setStudentName("Boris");
		     ArrayList<Student> studentsList = new ArrayList<Student>();
		     studentsList.add(student); studentsList.add(student1);
		     return studentsList;
			}
		//************** Retrieving Students data from DB  *******************
		
		@RequestMapping(value = "/student/{name}", method = RequestMethod.GET)
		public Student getStudent(@PathVariable("name") String studentName) {
			Student student = new Student();
			student.setStudentName(studentName);
			student.setStudentAge(3456);
			return student;
		}
		//******** Students update information *******
		//*******  ResponseEntity is used for status (200, 404, 500) to the Client
		@RequestMapping(value = "/student/{name}", method = RequestMethod.PUT)
			public ResponseEntity<Boolean> updateStudent(@PathVariable("name") String studentName, @RequestBody Student student) {
			System.out.println("Student Name: "+studentName);	
			System.out.println("Student Name: "+student.getStudentName()+" Student Age: "+student.getStudentAge());
			//here true is the response body(will be appearing in headers)
		//we should change Generic to Boolean, instead of Void
			return new ResponseEntity<Boolean>(true,HttpStatus.NOT_FOUND);
			
			}
		}

