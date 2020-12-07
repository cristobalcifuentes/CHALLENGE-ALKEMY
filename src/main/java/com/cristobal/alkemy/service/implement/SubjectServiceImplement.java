package com.cristobal.alkemy.service.implement;

import java.util.ArrayList;
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

	@Override
	public int cuposTomados(int idSubjec) {
		
		return subjectRepository.cuposTomados(idSubjec);
	}

	@Override
	public List<Subject> agregarCuposTomados(List<Subject> subjects) {
		
		List<Subject> subs = subjects;
		List<Subject> subjectsNews = new ArrayList<>();
		for(Subject subject : subs) {
			int cupoTomado = subjectRepository.cuposTomados(subject.getId());
			int TotalCupo = subject.getQuantity();
			int cuposDiponibles = TotalCupo - cupoTomado;
			Subject subjectsNew = subject;
			subjectsNew.setCuposDisponibles(cuposDiponibles);
			subjectsNews.add(subjectsNew);
		}
		return subjectsNews;
	}
	
	@Override
	public Subject agregarCuposTomados(Subject subject) {
		
		Subject sub = subject;
		int cupoTomado = subjectRepository.cuposTomados(sub.getId());
		int TotalCupo = sub.getQuantity();
		int cuposDiponibles = TotalCupo - cupoTomado;
		sub.setCuposDisponibles(cuposDiponibles);
		
		return sub;
	}

	@Override
	public List<Subject> cursosPorAlumno(int idUSer) {
		
		return subjectRepository.cursosPorAlumno(idUSer);
	}
	
	
	
	
	
	
	

}
