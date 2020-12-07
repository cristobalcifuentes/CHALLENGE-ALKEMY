package com.cristobal.alkemy.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.cristobal.alkemy.models.entity.DayHourHand;
import com.cristobal.alkemy.models.entity.PKSubjectUser;
import com.cristobal.alkemy.models.entity.Subject;
import com.cristobal.alkemy.models.entity.SubjectUser;

@Controller
@RequestMapping("/alumn")
public class AlumnController {
	
	@Autowired
	RestTemplate clienteRest;

	@Value("${proveedor.rest}")
	private String proveedorRest;
	
	
	
	
	@GetMapping("/mis-materias")
	public String misMaterias(Model model) {

		//obtener desde secion
		int idUser = 3 ;
		
		System.out.println("solicitud = *** " + proveedorRest + "/subject/por-alumno/" + idUser);
		
		List<Subject> ramos = Arrays.asList(clienteRest.getForObject(proveedorRest + "/subject/por-alumno/" + idUser, Subject[].class));
		
		model.addAttribute("ramos", ramos);
		return "/alumn/misMaterias";
	}
	
	@GetMapping("/Listado-materias")
	public String listado(Model model) {

		List<Subject> ramos = Arrays.asList(clienteRest.getForObject(proveedorRest + "/subject", Subject[].class));
		Collections.sort(ramos);
		model.addAttribute("ramos", ramos);
		return "/alumn/listadoRamos";
	}
	
	
	@GetMapping("/detalle-ramo/{id}")
	public String detalleRamo(@PathVariable int id, Model model) {

		Subject ramo = clienteRest.getForObject(proveedorRest + "/subject/" + id, Subject.class);
		
		//obtener id de sesion
		int idAlumno = 3;
		int idMateria = id;
		int idHorario= ramo.getDayHourHand().getId() ;
		int cupos = ramo.getCuposDisponibles();

		Integer existe = clienteRest.getForObject(proveedorRest + "/subject-user/existe/" + idMateria + "/" + idAlumno , Integer.class);
		Integer horarioTomado = clienteRest.getForObject(proveedorRest + "/day-hourhand/" + idAlumno + "/" + idHorario , Integer.class);
	
		model.addAttribute("cupos", cupos);
		model.addAttribute("horarioTomado", horarioTomado);
		model.addAttribute("existe", existe);
		model.addAttribute("ramo", ramo);
		
		return "/alumn/detalleRamo";
	}
	
	@GetMapping("/inscribirse/{id}")
	public String inscribirseRamo(@PathVariable int id, Model model) {

		//id rescatarlo de session
		int idUser = 3;
		PKSubjectUser pk = new PKSubjectUser(id, idUser);
		SubjectUser subjectUserenviar = clienteRest.postForObject(proveedorRest +  "/subject-user", pk, SubjectUser.class);
		
		return "redirect:/alumn/Listado-materias";
	}

	
	


}
