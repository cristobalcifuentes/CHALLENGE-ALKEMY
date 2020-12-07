package com.cristobal.alkemy.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristobal.alkemy.models.entity.Subject;
import com.cristobal.alkemy.service.interfaces.ISubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectRestController {
	
	
	@Autowired
	private ISubjectService subjectService;
	
	
	@GetMapping
	public ResponseEntity<List<Subject>> listar(){
		
		List<Subject> subjects =  subjectService.agregarCuposTomados( subjectService.listar()) ;
		return new ResponseEntity<List<Subject>>(subjects, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Subject> listarPorId(@PathVariable("id") Integer id){
		
		Subject subject = subjectService.agregarCuposTomados(subjectService.leerPorId(id));
		return new ResponseEntity<Subject>(subject, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Subject> registrar(@RequestBody Subject subject){
		
		Subject sub = subjectService.registrar(subject);
		return new ResponseEntity<Subject>(sub, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Subject> modificar(@RequestBody Subject subject){
		
		Subject sub = subjectService.registrar(subject);
		return new ResponseEntity<Subject>(sub, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Integer> eliminar(@PathVariable Integer id){
		subjectService.eliminar(id);
		return new ResponseEntity<Integer>(id, HttpStatus.OK);
		
	}
	
	@GetMapping("/por-alumno/{idUSer}")
	public  ResponseEntity<List<Subject>> cursosPorAlumno(@PathVariable int idUSer){
		
		System.out.println("llego al rest");
		List<Subject> subjects = subjectService.cursosPorAlumno(idUSer);
		return new ResponseEntity<List<Subject>>(subjects, HttpStatus.OK);
	}
	

	


}
