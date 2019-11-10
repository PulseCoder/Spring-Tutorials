package com.sahil.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	// need a controller method to show the initial form
		
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}
	
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
	}
	
	// new controller method to read the form data , add data to the model.
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest req,Model model){
		
		//read the request parameter from the Html form
		String theName=req.getParameter("studentName");
		// convert the data to all caps
		theName = theName.toUpperCase();
		// create the message
		String result = "Yo !!  "+theName;
		// add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
	
	// new controller method to read the form data , add data to the model.
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName,Model model){
		
		// convert the data to all caps
		theName = theName.toUpperCase();
		// create the message
		String result = "Yo Version 3 !!  "+theName;
		// add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
}
