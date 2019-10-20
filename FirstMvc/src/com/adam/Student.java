package com.adam;
import com.fasterxml.jackson.annotation.JsonInclude;

// @JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {
private long studentAge;
private String studentName;
 

public long getStudentAge(){
	 return studentAge;
 }
 public void setStudentAge(long studentAge) {
	 this.studentAge = studentAge;
 }
 public String getStudentName() {
	 return studentName;
 }
 public void setStudentName(String studentName) {
	 this.studentName = studentName;
 }
}
