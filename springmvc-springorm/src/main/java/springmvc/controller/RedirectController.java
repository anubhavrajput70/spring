package springmvc.controller;
//class for url redirect
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	@RequestMapping("/one")
	public RedirectView one()
	{
		System.out.println("this is one handler");
		//using RedirectView to rediect to the /enjoy url
		RedirectView redirect= new RedirectView();
		//don't use "/" before the name of the view otherwise it will remove the project name form the url so we are giving relative url
		
		redirect.setUrl("enjoy");
		return redirect;
	}
	
	@RequestMapping("/enjoy")
	public String two()
	{
		System.out.println("this is second handler [enjoy]");
		return "contact";
	}
	
	//use of redirect prefix
//	@RequestMapping("/one")
//	public String one()
//	{
//		System.out.println("this is one handler");
//		//using redirect prefix to rediect to the /enjoy url
//		return "redirect:/enjoy";
//	}
//	
//	@RequestMapping("/enjoy")
//	public String two()
//	{
//		System.out.println("this is second handler [enjoy]");
//		return "contact";
//	}
}
