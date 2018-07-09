spackage com.mtc.hasya.MVC;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
	return "show-page";	
	}
	
	
	@RequestMapping("/processForm")
    public String processForm() {
		return "process-form";
	}
	
//	new controller method to read form data 
//	add data to model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServeletRequest request, Model model) {
		
//		read the request parameter from HTML form
		String theName = request.getPameter("studentName");
//		convert to caps
		theName=theName.toUpperCase();
//		create message
		String result = "Yo!" + theName; 
//		add message to model 
		model.addAttribute("message",result);
		
		return"process-form";
		
	
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
//		convert to caps
		theName=theName.toUpperCase();
//		create message
		String result = "Hey! my friend " + theName; 
//		add message to model 
		model.addAttribute("message",result);
//		model is used to store the data and pass it to view
		return"process-form";
		
		
		
	}
}
