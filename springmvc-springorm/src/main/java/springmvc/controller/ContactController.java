package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	//add common data to the model, called before handleer
	@ModelAttribute
	public void commonDataOfModel(Model m)
	{
		m.addAttribute("head","fill it out");
		m.addAttribute("desc","home for programmer");
		System.out.println("aadding common data to model");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		System.out.println("creating form");
		return "contact";
	}
	
	@RequestMapping(path="/processform", method =RequestMethod.POST)
	//@ModelAttribute will bind the data with the user object 
	//@ModelAttribute has fatch the data of the form and created
	//the object of User class and set all the data in the object and set the User ovject to the model too
	public String handleForm(@ModelAttribute User user,Model model)
	{
		System.out.println(user);
		
		//redirecting to contact form if the userName is blank
		if(user.getUserName().isBlank())
		{
			return "redirect:/contact";
		}
		
		int createdUser=this.userService.createUser(user);
		model.addAttribute("msg","user created with id "+createdUser);
		return "success";
	}

}

/* 
use of @RequestParam annotation
// handling which is coming from contact.jsp page
@RequestMapping(path = "/processform", method = RequestMethod.POST)
// getting data form view with the help pof @ReuestParam annotations
public String handleForm(@RequestParam("email") String userEmail, @RequestParam("userName") String userName,
		@RequestParam("password") String userPassword, Model model) {

	User user = new User();
	user.setEmail(userEmail);
	user.setUserName(userName);
	user.setPassword(userPassword);
	System.out.println(user);
//	//printing data on the console System.out.println("user email "+userEmail);
//	  System.out.println("user name "+userName);
//	  System.out.println("user password "+userPassword);
//	 
//	// setting data int the model object to send to the successview
//	model.addAttribute("name", userName);
//	model.addAttribute("email", userEmail);
//	model.addAttribute("password", userPassword);
	
	//sending user object to the view
	model.addAttribute("user",user);
	// returning success.jsp view
	return "success";
}
*/