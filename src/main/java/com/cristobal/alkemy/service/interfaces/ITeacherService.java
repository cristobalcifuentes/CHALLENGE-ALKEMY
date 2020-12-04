package com.cristobal.alkemy.service.interfaces;

import java.util.List;

import com.cristobal.alkemy.models.entity.Subject;
import com.cristobal.alkemy.models.entity.Teacher;

public interface ITeacherService extends ICRUDService<Teacher> {
	
	int subjectAsociados(int idTeacher);
	List<Subject> obtenerListadoRamos(int idTeacher);

}
