package com.mtc.hasya.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {
	
// two methods having same request mapping results in an error -- add request mapping to class also -- making 
//	use of parent child request mapping for differentiation of links
	
	
	@RequestMapping("/showForm")
	public String silly() {
	return "silly";	
	}
	
}
