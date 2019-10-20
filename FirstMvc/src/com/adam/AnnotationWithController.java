package com.adam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
@Controller
public class AnnotationWithController {
@RequestMapping(value = "/SubmissionForm.html", method = RequestMethod.GET)
	public ModelAndView submission() throws Exception {
		//String exceptionOccured = "NULL_POINTER";
		String exceptionOccured = "ARITHMETIC_EXCEPTION";
		if(exceptionOccured.equalsIgnoreCase("NULL_POINTER")) {
			throw new NullPointerException("Null pointer exception obladi oblada");
		}else if(exceptionOccured.equalsIgnoreCase("ARITHMETIC_EXCEPTION")) {;
		throw new ArithmeticException("Unknown Exeption is occurred!!!!!");
		}
		ModelAndView submissionForm = new ModelAndView("SubmitForm");
		return submissionForm;
	}
//	//@RequestParam annotation - used for extracting parameters from http request;
//	@RequestMapping(value = "/SubmissionResponse.html", method = RequestMethod.POST)
//	public ModelAndView response(@RequestParam Map<Integer,String> parameters) {
//		int age = Integer.parseInt(parameters.get("studentAge"));
//		String name = parameters.get("studentName");
//		ModelAndView response = new ModelAndView("ResponseInfo");
//		response.addObject("message", "Hello "+name+" age "+age+" You have been appointed to nearest date");
//		return response;
//	}
	//@ModelAttribute annotation - used for binding object fields and incoming parameters from http request;
	//BindingResult invoke for Registration form resending to Client with concrete mistake description;
	@RequestMapping(value = "/SubmissionResponse.html", method = RequestMethod.POST)
	public ModelAndView response(@ModelAttribute("student") Student student1, BindingResult result) {
		if(result.hasErrors()) {
			ModelAndView response = new ModelAndView("SubmitForm");
			return response;
		}
		ModelAndView response = new ModelAndView("ResponseInfo");
		response.addObject("message", "Hello You have been appointed to nearest date");
		return response;
} 
	
	}
