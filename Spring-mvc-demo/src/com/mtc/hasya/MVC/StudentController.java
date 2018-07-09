package com.mtc.hasya.MVC;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student")
public class StudentController {
	
	
	//preprocessor method that executes before all methods in the class, no need mention for a particular method
	//to convert trim input strings
		//remove leading and whitespaces
		//resolve issues for validation
		@InitBinder
		public void initBinder(WebDataBinder dataBinder) {
			//trimming String (whitespaces)
			StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
			dataBinder.registerCustomEditor(String.class,  stringTrimmerEditor);
			
			
		}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		Student theStudent = new Student();
		
		theModel.addAttribute("student",theStudent);
		
		return "student-form";
	}

	@RequestMapping("/processForm")
	//this check all the validations for all attributes, if one of them fails, returns student form
	// @valid performs validations on student and stores the rsults in binding result
	public String processForm(@valid @ModelAttribute("student") Student theStudent, BindingResult theBindingResult) {
		
		
		System.out.println("Binding result:" +theBindingResult);
		
		if(theBindingResult.hasErrors()) {
			return "student-form";
		}
		else {
		System.out.println("theStudent:"+ theStudent.getFirstname()+" "+theStudent.getLastname());
		
		return "Student-confirmation";
		}
	}
	
}
