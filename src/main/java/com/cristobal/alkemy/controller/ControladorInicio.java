package com.cristobal.alkemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cristobal.alkemy.models.entity.UserLoginDTO;

@Controller
public class ControladorInicio {
	
	@GetMapping(value = { "/home", "", "/", "/index" })
	public String inicio(Model model) {
				
		model.addAttribute("command", new UserLoginDTO());
		return "login";
		
	}
	


}
