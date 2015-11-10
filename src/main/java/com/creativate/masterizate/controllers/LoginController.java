package com.creativate.masterizate.controllers;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.creativate.masterizate.model.objects.User;
import com.creativate.masterizate.services.UserService;
 
@Controller
public class LoginController
{
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private UserService service;
    
  //Spring Security see this :
  	@RequestMapping(value = "/login", method = RequestMethod.GET)
  	public ModelAndView login(
  		@RequestParam(value = "error", required = false) String error,
  		@RequestParam(value = "logout", required = false) String logout) {
  		logger.info("Vale, usamos el correcto, pero que valores tenemos?. " + logout);
		System.out.println("Empezamos...");
  		ModelAndView model = new ModelAndView();
  		if (error != null) {
  			model.addObject("error", "Invalid username and password!");
  		}
   
  		if (logout != null) {
  			model.addObject("msg", "You've been logged out successfully.");
  		}
  		model.setViewName("login");
   
  		return model;
   
  	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login2(
		@RequestParam(value = "username", required = true) String username,
		@RequestParam(value = "password", required = false) String password,
		@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {
		System.out.println("Contunuamos aqui...");
		ModelAndView modelAndView = new ModelAndView();//"index");
  		User usuario = service.getUser(username);
  		if(password.equals(usuario.getPassword())){
  			modelAndView.addObject("users", usuario );
  			modelAndView.setViewName("perfil");
  			System.out.println("Vamos a Perfil?...");
  		}else{
  			modelAndView.addObject("error", "Invalid username and password!");
  			modelAndView.setViewName("login");
  			System.out.println("Vamos a Login?...");

  		}

  		System.out.println(service.getAllUsers());
  		return modelAndView;
	}
  
}
