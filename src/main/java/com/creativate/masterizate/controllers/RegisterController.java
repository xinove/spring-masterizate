package com.creativate.masterizate.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.creativate.masterizate.model.objects.Client;
import com.creativate.masterizate.model.objects.User;
import com.creativate.masterizate.services.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class RegisterController {
	
	private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);
	
	@Autowired
    private UserService userManager;
	
	//Spring Security see this :
	@RequestMapping(value = {"/", "/register"}, method = RequestMethod.GET)
	public ModelAndView register(
		//@RequestParam(value = "error", required = false) String error,
		//@RequestParam(value = "logout", required = false) String logout
		) {
 
		logger.info("Comenzamos a consultar el tema");

		ModelAndView model = new ModelAndView();
		//if (error != null) {
	//		model.addObject("error", "Invalid username and password!");
		//}
 
//		if (logout != null) {
//			model.addObject("msg", "You've been logged out successfully.");
//		}
		model.setViewName("home");
		return model;
 
	}
	//Spring Security see this :
		@RequestMapping(value = {"/", "/register"}, method = RequestMethod.POST)
		public ModelAndView registerGet(@RequestParam(value = "nombre", required = false) String name, 
										@RequestParam(value = "usuario", required = false) String user, 
										@RequestParam(value = "pass", required = false) String password, 
										@RequestParam(value = "correo", required = false) String email) {
	 
			System.out.println("NOMBRE: " + name  +  "EMAIL: " + email);
			ModelAndView model = new ModelAndView();
			logger.info("Comenzamos a consultar el tema");
			Client client = new Client();
			User usuario = new User();
			usuario.setUsername(user);
			usuario.setPassword(password);
			System.out.println(usuario.toString());
			
			userManager.addUser(usuario); 
			model.setViewName("altaCorrecta");
			
			return model;
		}
		
		@RequestMapping(value = { "/helloworld**" }, method = RequestMethod.GET)
		 public ModelAndView welcomePage() {
			logger.info("Supongo que deberia entrar aki...");
			 ModelAndView model = new ModelAndView();
			 model.addObject("title", "Spring Security 3.2.3 Hello World Application");
			 model.addObject("message", "Welcome Page !");
			 model.setViewName("helloworld");
			 return model;
		 
		 }
}
