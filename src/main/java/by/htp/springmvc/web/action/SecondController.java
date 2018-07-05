package by.htp.springmvc.web.action;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/second")
public class SecondController {
	
	@RequestMapping(value = "/seconduser", method = RequestMethod.GET)
	   public String printHello(@RequestParam(required = false) String user, ModelMap model) 
	{
		  System.out.println("user sec");
	      model.addAttribute("message", "user");
	      return "hello";
	 }
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	   public String printAdmin(@RequestParam(required = false) String user, ModelMap model) 
	{
		  System.out.println("admin sec ");
	      model.addAttribute("message", "adminsec");
	      return "hello";
	 }
	
	@RequestMapping(value = "/newUser", method = RequestMethod.GET)
	   public ModelAndView newUser() 
	{
		System.out.println("asdfasd");
	    return new ModelAndView("jqueryPage", "command", new User());
	 }
	
	@RequestMapping(value = "/checkPasss", method = RequestMethod.GET, produces = {"text/html; charset=UTF-8"})
	public @ResponseBody
	   String checkPassword(Model model, @RequestParam String password) 
	{	
		System.out.println(password);
		model.addAttribute("message", password);
	      return "jqueryPage";
	 }
	
	@RequestMapping(value = "/def", method = RequestMethod.GET)
	   public String printSl(@RequestParam(required = false) String user, ModelMap model) 
	{
		  System.out.println("/ sec");
	      model.addAttribute("message", "sec//");
	      return "hello";
	 }
}
