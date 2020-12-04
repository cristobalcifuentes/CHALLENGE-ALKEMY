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
import org.springframework.web.client.RestTemplate;

import com.cristobal.alkemy.models.entity.Subject;
import com.cristobal.alkemy.models.entity.Teacher;

@Controller
public class SubjectController {

	@Autowired
	RestTemplate clienteRest;

	@Value("${proveedor.rest}")
	private String proveedorRest;

	@GetMapping("/gestionar-ramos")
	public String inicio(Model model) {

		List<Subject> ramos = Arrays.asList(clienteRest.getForObject(proveedorRest + "/subject", Subject[].class));
		model.addAttribute("ramos", ramos);
		return "/gestionarramos";
	}

	@GetMapping("/detalle-ramo/{id}")
	public String detalle(@PathVariable int id, Model model) {

		Subject ramo = clienteRest.getForObject(proveedorRest + "/subject/" + id, Subject.class);
		model.addAttribute("ramo", ramo);
		return "/detalleRamoAdmin";
	}

	@GetMapping("/editar-ramo/{id}")
	public String editar(@PathVariable int id, Model model) {

		Subject ramo = clienteRest.getForObject(proveedorRest + "/subject/" + id, Subject.class);
		List<Teacher> profesores = Arrays.asList(clienteRest.getForObject(proveedorRest + "/teachers", Teacher[].class));
		model.addAttribute("profesores", profesores);
		model.addAttribute("command", ramo);
		return "/editarRamo";
	}
	
	@PostMapping("/guardar-ramo-editado")
	public String guardarEdicionRamo(Subject subject) {
		
		System.out.println(subject);
		
		return "redirect:/gestionar-ramos";
	}

}
