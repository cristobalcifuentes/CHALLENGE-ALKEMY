package com.cristobal.alkemy.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobal.alkemy.models.entity.Subject;
import com.cristobal.alkemy.models.repository.ISubjectRepository;
import com.cristobal.alkemy.service.interfaces.ISubjectService;

@Service
public class SubjectServiceImplement implements ISubjectService {
	
	@Autowired
	private ISubjectRepository subjectRepository;

	@Override
	public Subject registrar(Subject subject) {
		
		return subjectRepository.save(subject);
	}

	@Override
	public Subject modificar(Subject subject) {
		
		return subjectRepository.save(subject);
	}

	@Override
	public List<Subject> listar() {
		
		return subjectRepository.findAll();
	}

	@Override
	public Subject leerPorId(Integer id) {
		
		Optional<Subject> subject = subjectRepository.findById(id);
		return subject.isPresent() ? subject.get(): new Subject();
	}

	@Override
	public boolean eliminar(Integer id) {
		
		subjectRepository.deleteById(id);
		return false;
	}

}
