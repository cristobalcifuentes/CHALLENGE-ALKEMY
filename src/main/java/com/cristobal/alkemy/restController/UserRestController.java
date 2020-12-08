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

import com.cristobal.alkemy.models.entity.User;
import com.cristobal.alkemy.service.interfaces.IUserService;

@RestController
@RequestMapping("/users")
public class UserRestController {
	
	@Autowired
	private IUserService userService;
	
	
	@GetMapping
	public ResponseEntity<List<User>> listar(){
		
		List<User> users = userService.listar();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> listarPorId(@PathVariable("id") Integer id){
		
		User user = userService.leerPorId(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<User> registrar(@RequestBody User user){
		
		User us = userService.registrar(user);
		return new ResponseEntity<User>(us, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<User> modificar(@RequestBody User user){
		
		User us = userService.registrar(user);
		return new ResponseEntity<User>(us, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Integer> eliminar(@PathVariable Integer id){
		
		userService.eliminar(id);
		return new ResponseEntity<Integer>(id, HttpStatus.OK);
		
	}
	
	
	@GetMapping("/rut/{rut}")
	public ResponseEntity<User> listarPorRut(@PathVariable String rut){
		
		User user = userService.getByRut(rut).get() ;
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	

}
