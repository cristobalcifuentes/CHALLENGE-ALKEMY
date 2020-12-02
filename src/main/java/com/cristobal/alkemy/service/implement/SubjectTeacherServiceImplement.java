package com.cristobal.alkemy.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobal.alkemy.models.entity.PKSubjectTeacher;
import com.cristobal.alkemy.models.entity.SubjectTeacher;
import com.cristobal.alkemy.models.repository.ISubjectTeacherRepository;
import com.cristobal.alkemy.service.interfaces.ISubjectTeacherService;

@Service
public class SubjectTeacherServiceImplement implements ISubjectTeacherService {
	
	@Autowired
	private ISubjectTeacherRepository ISubjectTeacherRepository;

	@Override
	public SubjectTeacher registrar(SubjectTeacher subjectTeacher) {
		
		return ISubjectTeacherRepository.save(subjectTeacher);
	}

	@Override
	public SubjectTeacher modificar(SubjectTeacher subjectTeacher) {
		
		return ISubjectTeacherRepository.save(subjectTeacher);
	}

	@Override
	public List<SubjectTeacher> listar() {
		
		return ISubjectTeacherRepository.findAll();
	}

	@Override
	public SubjectTeacher leerPorId(PKSubjectTeacher id) {
		
		Optional<SubjectTeacher> subjectTeacher = ISubjectTeacherRepository.findById(id);
		return subjectTeacher.isPresent() ? subjectTeacher.get() : new SubjectTeacher();
	}

	@Override
	public boolean eliminar(PKSubjectTeacher id) {
		
		ISubjectTeacherRepository.deleteById(id);
		return false;
	}



}
