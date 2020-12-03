package com.cristobal.alkemy.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.cristobal.alkemy.models.entity.Teacher;



@Controller
public class TeacherController {
	
	@Autowired
	RestTemplate clienteRest;
	
	@GetMapping("/gestionar-profesores")
	public String inicio(Model model) {
				
		List<Teacher> profesores = Arrays.asList(clienteRest.getForObject("http://localhost:9857/teachers", Teacher[].class));
		model.addAttribute("profesores", profesores);
		return "gestionarprofesores";
	}
	
	@GetMapping("/editarprofesor/{id}")
	public String editarprofesor(@PathVariable int id, Model model) {
				
		Teacher profesor = clienteRest.getForObject("http://localhost:9857/teachers/" + id, Teacher.class);
		model.addAttribute("command", profesor);
		return "/editarprofesor";
	}
	
	@PostMapping("/guardarprofesor")
	public String guardarprofesor( Teacher teacher) {
				
		clienteRest.postForLocation("http://localhost:9857/teachers/", teacher);
		return "redirect:/gestionar-profesores";
	}
	
	
	@GetMapping("/eliminarprofesor/{id}")
	public String eliminarprofesor(@PathVariable int id) {
				
		clienteRest.delete("http://localhost:9857/teachers/" + id);
		return "redirect:/gestionar-profesores";
	}
	
	
	
	@GetMapping("/nuevoprofesor")
	public String crearprofesor(Model model) {
				
		model.addAttribute("command", new Teacher());
		return "/editarprofesor";
	}
	
	
	
	
	

}
