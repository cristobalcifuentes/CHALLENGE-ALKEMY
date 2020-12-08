package com.cristobal.alkemy.controller;


import java.security.Principal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cristobal.alkemy.models.DTO.UserLoginDTO;
import com.cristobal.alkemy.models.entity.User;
import com.cristobal.alkemy.models.entity.UserRole;
import com.cristobal.alkemy.models.repository.IUserRepository;

@Controller
public class ControladorInicio {
	
	@Autowired
	private IUserRepository userRepository;
	
	@GetMapping(value = { "/home", "", "/"})
	public String inicio(Model model, Principal principal) {
			
		if(principal != null ) {
			return "redirect:/index";
		}
		model.addAttribute("command", new UserLoginDTO());
		return "login";
		
	}
	
	@GetMapping("/index")
	public String index(Principal principal) {
		
		if(principal != null) {
			User user = userRepository.findByRut(principal.getName()).get();
			for(UserRole rol: user.getRoles()) {
				if(rol.getRole().getRole().equals("student")) {
					return "/alumn/indexAlumn";
				}
				if(rol.getRole().getRole().equals("administrator")){
					return "/admin/indexadmin";
				}
			}
		}
		return "redirect:/";
	}
	
	
	@GetMapping("/login")
	public String login() {
		
		return "redirect:/index";
	}


}
