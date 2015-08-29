package com.creativate.masterizate.controllers;
 
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.creativate.masterizate.model.UserDAO;
import com.creativate.masterizate.model.objects.User;
 
@Controller
public class PerfilController
{
	private static final Logger logger = LoggerFactory.getLogger(PerfilController.class);

	//@Autowired
	//private UserService service;
    
    //Spring Security see this :
  	@RequestMapping(value = "/perfil", method = RequestMethod.GET)
  	public ModelAndView perfil(
  		@RequestParam(value = "error", required = false) String error,
  		@RequestParam(value = "logout", required = false) String logout) {
  		logger.info("Vamos a GET listar los usuarios existentes en la BD que no existe xD");
		
  		
  		List<User> users = null;//service.listPerson();
  				
  		
  		ModelAndView modelAndView = new ModelAndView();//"index");
  		modelAndView.addObject("users", users );
  		
  		logger.info("Recorremos los Usuarios");
  		if (users != null){
	  		for(User usuario : users){
	  			logger.info("Usuario: " + usuario.getUsername());
	  		}
  		}
  		modelAndView.setViewName("perfil");

  		return modelAndView;
   
  	}
  	@RequestMapping(value = "/perfil", method = RequestMethod.POST)
  	public ModelAndView perfilPost(
  		@RequestParam(value = "error", required = false) String error,
  		@RequestParam(value = "logout", required = false) String logout) {
  		logger.info("Vamos a POST listar los usuarios existentes en la BD que no existe xD");
		
  		List<User> users = null;//sservice.readAll();
  		
  		ModelAndView modelAndView = new ModelAndView();//"index");
  		modelAndView.addObject("users", users );
  		if (users != null){
	  		logger.info("Recorremos los Usuarios");
	  		for(User usuario : users){
	  			logger.info("Usuario: " + usuario.getUsername());
	  		}
  		}
  		modelAndView.setViewName("lusuarios");

  		return modelAndView;
   
  	}
}
