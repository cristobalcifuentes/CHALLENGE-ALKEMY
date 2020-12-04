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

import com.cristobal.alkemy.models.entity.DayHourHand;
import com.cristobal.alkemy.service.interfaces.IDayHourHandService;

@RestController
@RequestMapping("/day-hourhand")
public class DayHourHandRestController {
	
	@Autowired
	private IDayHourHandService dayHourHandService;
	
	
	@GetMapping
	public ResponseEntity<List<DayHourHand>> listar(){
		
		List<DayHourHand> dayHourHand = dayHourHandService.listar();
		return new ResponseEntity<List<DayHourHand>>(dayHourHand, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DayHourHand> listarPorId(@PathVariable("id") Integer id){
		
		DayHourHand dayHourHand = dayHourHandService.leerPorId(id);
		return new ResponseEntity<DayHourHand>(dayHourHand, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<DayHourHand> registrar(@RequestBody DayHourHand dayHourHand){
		
		DayHourHand sub = dayHourHandService.registrar(dayHourHand);
		return new ResponseEntity<DayHourHand>(sub, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<DayHourHand> modificar(@RequestBody DayHourHand dayHourHand){
		
		DayHourHand sub = dayHourHandService.registrar(dayHourHand);
		return new ResponseEntity<DayHourHand>(sub, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Integer> eliminar(@PathVariable Integer id){
		dayHourHandService.eliminar(id);
		return new ResponseEntity<Integer>(id, HttpStatus.OK);
		
	}

	@PostMapping("/por-campos")
	public ResponseEntity<DayHourHand> obtenerDayHourHandPorCampos(@RequestBody DayHourHand dayHourHand){
		
		DayHourHand sub = dayHourHandService.obtenerDayHourHandPorCampos(dayHourHand);
		return new ResponseEntity<DayHourHand>(sub, HttpStatus.OK);
	}

}
