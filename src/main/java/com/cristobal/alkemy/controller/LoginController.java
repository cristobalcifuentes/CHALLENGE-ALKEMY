package com.cristobal.alkemy.controller;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cristobal.alkemy.models.entity.UserLoginDTO;

@Controller
public class LoginController {
	
	@PostMapping("/login")
	public String login(UserLoginDTO user) {
		
		System.out.println(user.getPassword());
		System.out.println(user.getRut());
		
		System.out.println("llego al controlador");
		if (user.getRut() == "") {
			System.out.println("user vacio");
			return "redirect:/";
		}
		return "/index";
	}

}
