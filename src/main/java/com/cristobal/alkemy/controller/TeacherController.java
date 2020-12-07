package com.cristobal.alkemy.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.cristobal.alkemy.models.entity.Subject;
import com.cristobal.alkemy.models.entity.Teacher;



@Controller
@RequestMapping("/admin")
public class TeacherController {
	
	@Autowired
	RestTemplate clienteRest;
	
	@Value("${proveedor.rest}")
	private String proveedorRest;
	
	@GetMapping("/gestionar-profesores")
	public String inicio(Model model) {
				
		List<Teacher> profesores = Arrays.asList(clienteRest.getForObject(proveedorRest + "/teachers", Teacher[].class));
		model.addAttribute("profesores", profesores);
		return "/admin/gestionarprofesores";
	}
	
	@GetMapping("/editarprofesor/{id}")
	public String editarprofesor(@PathVariable int id, Model model) {
		
		Integer asociados = clienteRest.getForObject(proveedorRest + "/teachers/asociados/" + id, Integer.class);
		Teacher profesor = clienteRest.getForObject(proveedorRest + "/teachers/" + id, Teacher.class);
		List<Subject> subject = Arrays.asList(clienteRest.getForObject(proveedorRest + "/teachers/subject/" + id, Subject[].class));
		model.addAttribute("asociados", asociados);
		model.addAttribute("profesor", profesor);
		model.addAttribute("command", profesor);
		model.addAttribute("ramos", subject);
		return "/admin/editarprofesor";
	}
	
	@PostMapping("/guardarprofesor")
	public String guardarprofesor( Teacher teacher) {
				
		clienteRest.postForLocation(proveedorRest + "/teachers/", teacher);
		return "redirect:/admin/gestionar-profesores";
	}
	
	
	@GetMapping("/eliminarprofesor/{id}")
	public String eliminarprofesor(@PathVariable int id) {
				
		clienteRest.delete(proveedorRest + "/teachers/" + id);
		return "redirect:/admin/gestionar-profesores";
	}
	
	
	
	@GetMapping("/nuevoprofesor")
	public String crearprofesor(Model model) {
				
		model.addAttribute("command", new Teacher());
		return "/admin/editarprofesor";
	}
	
	
	
	
	

}
