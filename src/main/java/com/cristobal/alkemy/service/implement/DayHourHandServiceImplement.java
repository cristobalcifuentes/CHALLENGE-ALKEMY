package com.cristobal.alkemy.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobal.alkemy.models.entity.DayHourHand;
import com.cristobal.alkemy.models.repository.IDayHourHandRepository;
import com.cristobal.alkemy.service.interfaces.IDayHourHandService;

@Service
public class DayHourHandServiceImplement implements IDayHourHandService{
	
	@Autowired
	private IDayHourHandRepository dayHourHandRepository; 
	

	@Override
	public DayHourHand registrar(DayHourHand dayHourHand) {
		
		return dayHourHandRepository.save(dayHourHand);
	}

	@Override
	public DayHourHand modificar(DayHourHand dayHourHand) {
		
		return dayHourHandRepository.save(dayHourHand);
	}

	@Override
	public List<DayHourHand> listar() {
		
		return dayHourHandRepository.findAll();
	}

	@Override
	public DayHourHand leerPorId(Integer id) {
		
		Optional<DayHourHand> dayHourHand = dayHourHandRepository.findById(id);
		return dayHourHand.isPresent() ? dayHourHand.get() : new DayHourHand();
	}

	@Override
	public boolean eliminar(Integer id) {
		
		 dayHourHandRepository.deleteById(id);
		return true;
	}

	@Override
	public DayHourHand obtenerDayHourHandPorCampos(DayHourHand dayHourHand) {
		
		return dayHourHandRepository.obtenerDayHourHandPorCampos(dayHourHand.getDay().getId(), dayHourHand.getHourHand().getId());
	}

	@Override
	public int horarioAlumno(int IdUser, int idDayHourHand) {

		return dayHourHandRepository.horarioAlumno(IdUser, idDayHourHand);
	}
	
	

}
