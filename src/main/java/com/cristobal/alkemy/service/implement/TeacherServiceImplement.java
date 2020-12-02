package com.cristobal.alkemy.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobal.alkemy.models.entity.Teacher;
import com.cristobal.alkemy.models.repository.ITeacherRepository;
import com.cristobal.alkemy.service.interfaces.ITeacherService;

@Service
public class TeacherServiceImplement implements ITeacherService {
	
	@Autowired
	private ITeacherRepository teacherRepository;

	@Override
	public Teacher registrar(Teacher teacher) {
		
		return teacherRepository.save(teacher);
	}

	@Override
	public Teacher modificar(Teacher teacher) {
		
		return teacherRepository.save(teacher);
	}

	@Override
	public List<Teacher> listar() {
		
		return teacherRepository.findAll();
	}

	@Override
	public Teacher leerPorId(Integer id) {
		
		Optional<Teacher> teacher = teacherRepository.findById(id);
		return teacher.isPresent() ? teacher.get() : new Teacher();
	}

	@Override
	public boolean eliminar(Integer id) {
		
		teacherRepository.deleteById(id); ;
		return true;
	}

}
