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

import com.cristobal.alkemy.models.entity.PKSubjectUser;
import com.cristobal.alkemy.models.entity.SubjectUser;
import com.cristobal.alkemy.service.interfaces.ISubjectUserService;

@RestController
@RequestMapping("/subject-user")
public class SubjectUserRestController {
	
	@Autowired
	private ISubjectUserService subjectUserService;
	
	

	@GetMapping
	public ResponseEntity<List<SubjectUser>> listar(){

		List<SubjectUser> subjectUsers = subjectUserService.listar();
		return new ResponseEntity<List<SubjectUser>>(subjectUsers, HttpStatus.OK);
	}
	
	
	@GetMapping("/{subject}/{user}")
	public ResponseEntity<SubjectUser> listarPorId(@PathVariable Integer subject, @PathVariable Integer user){
		
		PKSubjectUser id = subjectUserService.crearPK(subject, user);
		SubjectUser subjectUser = subjectUserService.leerPorId(id);
		return new ResponseEntity<SubjectUser>(subjectUser, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<SubjectUser> registrar(@RequestBody PKSubjectUser pKSubjectUser){
		
		SubjectUser subjectUserNew = subjectUserService.registrar(pKSubjectUser);
		return new ResponseEntity<SubjectUser>(subjectUserNew, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<SubjectUser> modificar(@RequestBody SubjectUser subjectUser){
		
		SubjectUser subjectUserNew = subjectUserService.modificar(subjectUser);
		return new ResponseEntity<SubjectUser>(subjectUserNew, HttpStatus.OK);
	}
	
	@DeleteMapping("/{subject}/{user}")
	public ResponseEntity<PKSubjectUser> eliminar(@PathVariable Integer subject, @PathVariable Integer user){
		
		PKSubjectUser id = subjectUserService.crearPK(subject, user);
		subjectUserService.eliminar(id);
		return new ResponseEntity<PKSubjectUser>(id, HttpStatus.OK);
		
	}
	
	@GetMapping("/existe/{subject}/{user}")
	public ResponseEntity<Integer> existe(@PathVariable Integer subject, @PathVariable Integer user){
		
		PKSubjectUser pKSubjectUser = subjectUserService.crearPK(subject, user);
		Integer existe = subjectUserService.existe(pKSubjectUser);
		return new ResponseEntity<Integer>(existe, HttpStatus.OK);
	}
	
	
	
	

}
