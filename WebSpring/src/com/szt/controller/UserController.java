package com.szt.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.szt.container.ServiceProvider;
import com.szt.model.User;
import com.szt.service.IUserService;
import com.szt.test.TestService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String returnUser(){
		return "user";
	}
	
	
	@RequestMapping(value="/save" ,method=RequestMethod.GET)
	public String saveUser(){
		
		TestService testService=new TestService();
		
	//	testService.saveUser();
		
		return "save_result";
	}
	
	
	 @RequestMapping(value = "/user_add", method = RequestMethod.GET)
	   public ModelAndView student() {
	      return new ModelAndView("user_add", "command", new User());
	   }
	
	
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute("SpringWeb")User user, 
	   ModelMap model) {
	      model.addAttribute("name", user.getName());
	      model.addAttribute("age", user.getAge());
	      model.addAttribute("address", user.getAddress());
	      model.addAttribute("state", user.getState());
	      model.addAttribute("zip", user.getZip());
	      model.addAttribute("city", user.getCity());
	      //TestService testService=new TestService();
	      
	      Date t = new Date();
	      User u=new User();
			u.setName(user.getName());
			u.setAge(user.getAge());
			u.setAddress(user.getAddress());
			u.setCity(user.getCity());
			u.setState(user.getState());
			u.setZip(user.getZip());
			u.setDate(t);
	      
	      
			
		ServiceProvider serviceProvider=new ServiceProvider();	
		IUserService service=(IUserService) serviceProvider.getService(IUserService.SERVICE_NAME);
			
			service.saveUser(u);
			
			//testService.saveUser(u);
	      
	      
	      
	      return "result";
	   }
}
