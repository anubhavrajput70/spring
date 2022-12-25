package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	//it means to which url we have to map this function
	@RequestMapping("/home")
	//sending data from controller to view with the help of model
	//Controller---->Model------->view
	//handler method
	public String home(Model model)
	{
		System.out.println("this is home url");
		
		//sending string to view
		model.addAttribute("name", "Anubhav Rajput");
		
		//sending integer to view
		model.addAttribute("id",323);
		
		//sending collection to view
		List<String> friends=new ArrayList<String>();
		friends.add("Anubhav");
	    friends.add("Garima");
		friends.add("Al2");
		friends.add("Neha");
		model.addAttribute("f",friends);
		//name of the view
		return "index";
	}
	//specified that the submission on this url is in the form of GET method
	@RequestMapping(path="/about",method=RequestMethod.GET)
	public String about()
	{
		System.out.println("this is about url");
		return "about";
	}
	
	@RequestMapping("/help")
	//sending data from controller to view with the help of model
	//Controller---->ModelAndView------->view
	public ModelAndView help()
	{
		System.out.println("this is help controller");
		//creating model and view object
		ModelAndView modelAndView=new ModelAndView();
		//setting the data
		modelAndView.addObject("name", "Anubhav");
		modelAndView.addObject("roll",1221);
		//setting local time to now object
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(121);
		list.add(5454);
		list.add(54);
		list.add(53);
		list.add(1251);
		modelAndView.addObject("marks",list);
		
		//setting view name     
		modelAndView.setViewName("help");
		return modelAndView;
	}

}
