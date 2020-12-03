package com.cristobal.alkemy.controller;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cristobal.alkemy.models.DTO.UserLoginDTO;

@Controller
public class LoginController {
	
	@PostMapping("/login")
	public String login(UserLoginDTO user) {
		
		System.out.println(user.getPassword());
		System.out.println(user.getRut());
		
		System.out.println("llego al controlador logincontroller metodo login");
		if (user.getRut().equals("admin")) {
			System.out.println("admin");
			return "/indexadmin";
		}
		return "/index";
	}

}
