package com.adam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
//@RequestMapping("hello") //<--inhere we implements REST concept, to call certain resource by reference
public class HelloController{
	@RequestMapping(value = "welcome/", method = RequestMethod.GET)//<--Recourse
	public ModelAndView hit()  {
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("msg","Annotation based");
		return modelAndView;
	}
	//in pattern bellow, all incoming variables which receiving from Path we assigned to Map(pair of key value)
	@RequestMapping(value = "/{country}/{userName}", method = RequestMethod.GET)
public ModelAndView curlyBraces(@PathVariable Map<String,String> pathVar) {
	ModelAndView mav = new ModelAndView("HelloPage");
	String name = pathVar.get("userName");
	String country = pathVar.get("country");
	String invitation = "Hello "+name+" You are from "+country;
	mav.addObject("msg", invitation);
	return mav;
	}
}
