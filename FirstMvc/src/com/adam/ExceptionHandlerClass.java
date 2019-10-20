package com.adam;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

//This is common Exception processing Class for all project Controllers
@ControllerAdvice
public class ExceptionHandlerClass {
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionNullPointerProccess(Exception e) {
		System.out.println("Null pointer has been occurred!! "+e);
		return "NullPoint";
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)//showing in header code 500!!!!
@ExceptionHandler(value = Exception.class)
	public String exceptionProccess(Exception e) {
		System.out.println("Excetion "+e);
		return "Exception";
	}
}
