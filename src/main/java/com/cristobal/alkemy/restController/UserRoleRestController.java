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

import com.cristobal.alkemy.models.entity.PKUserRole;
import com.cristobal.alkemy.models.entity.UserRole;
import com.cristobal.alkemy.service.interfaces.IUserRoleService;

@RestController
@RequestMapping("/user-role")
public class UserRoleRestController {
	
	@Autowired
	private IUserRoleService userRoleService;
	
	@GetMapping
	public ResponseEntity<List<UserRole>> listar(){
		
		List<UserRole> userRole = userRoleService.listar();
		return new ResponseEntity<List<UserRole>>(userRole, HttpStatus.OK);
	}
	
	@GetMapping("/{user}/{role}")
	public ResponseEntity<UserRole> listarPorId(@PathVariable Integer user, @PathVariable Integer role){
		
		PKUserRole pkUserRole = userRoleService.crearPK(user, role);
		UserRole userRole = userRoleService.leerPorId(pkUserRole);
		return new ResponseEntity<UserRole>(userRole, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<UserRole> registrar(@RequestBody UserRole userRole){
		
		UserRole sub = userRoleService.registrar(userRole);
		return new ResponseEntity<UserRole>(sub, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<UserRole> modificar(@RequestBody UserRole userRole){
		
		UserRole sub = userRoleService.registrar(userRole);
		return new ResponseEntity<UserRole>(sub, HttpStatus.OK);
	}
	
	@DeleteMapping("/{user}/{role}")
	public ResponseEntity<PKUserRole> eliminar(@PathVariable Integer user, @PathVariable Integer role){
		
		PKUserRole pkUserRole = userRoleService.crearPK(user, role);
		userRoleService.eliminar(pkUserRole);
		return new ResponseEntity<PKUserRole>(pkUserRole, HttpStatus.OK);
		
	}

}
