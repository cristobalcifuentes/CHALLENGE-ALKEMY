package com.cristobal.alkemy.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.cristobal.alkemy.models.entity.Subject;

@Controller
public class SubjectController {
	
	@Autowired
	RestTemplate clienteRest;
	
	
	@GetMapping("/gestionar-ramos")
	public String inicio(Model model) {
				
		List<Subject> ramos = Arrays.asList(clienteRest.getForObject("http://localhost:9857/subject", Subject[].class));
		model.addAttribute("ramos", ramos);
		return "/gestionarramos";
	}
	
	
	
	@GetMapping("/detalle-ramo/{id}")
	public String detalle(@PathVariable int id, Model model) {
				
		Subject ramo = clienteRest.getForObject("http://localhost:9857/subject/" + id, Subject.class);
		model.addAttribute("ramo", ramo);
		System.out.println(ramo);
		return "/detalleRamoAdmin";
	}
	
	
	
	@GetMapping("/editar-ramo/{id}")
	public String editar(@PathVariable int id, Model model) {
				
		Subject ramo = clienteRest.getForObject("http://localhost:9857/subject/" + id, Subject.class);
		model.addAttribute("ramo", ramo);
		System.out.println(ramo);
		return "/editarRamo";
	}

}
