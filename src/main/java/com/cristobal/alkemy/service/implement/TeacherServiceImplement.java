package com.cristobal.alkemy.service.implement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobal.alkemy.models.entity.Subject;
import com.cristobal.alkemy.models.entity.Teacher;
import com.cristobal.alkemy.models.repository.ISubjectRepository;
import com.cristobal.alkemy.models.repository.ITeacherRepository;
import com.cristobal.alkemy.service.interfaces.ITeacherService;

@Service
public class TeacherServiceImplement implements ITeacherService {
	
	@Autowired
	private ITeacherRepository teacherRepository;
	
	@Autowired
	private ISubjectRepository subjectRepository;

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

	@Override
	public int subjectAsociados(int idTeacher) {
		
		
		return teacherRepository.subjectAsociados(idTeacher);
		
		
	}

	@Override
	public List<Subject> obtenerListadoRamos(int idTeacher) {
		
		List<Integer> idsSubject =  teacherRepository.idsSubjectTeacher(idTeacher);   
		List<Subject> subjects = new ArrayList<>();
		for(Integer id: idsSubject) {
			Optional<Subject> optional = subjectRepository.findById(id);
			if(optional != null) {
				Subject subject = optional.get();
				subjects.add(subject);
			}
		}
		
		return subjects;
	}

	@Override
	public List<Teacher> listarHabilitados(List<Teacher> teachers) {
		
		List<Teacher> teachs = teachers;
		List<Teacher> TeachersNew = new ArrayList();
		for(Teacher teacher: teachs) {
			if(teacher.getEnabled().getEnabled().equals("activo")) {
				TeachersNew.add(teacher);
				System.out.println(teacher);
			}
		}
		
		return TeachersNew;
	}

}
