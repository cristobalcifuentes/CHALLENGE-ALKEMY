package com.cristobal.alkemy.service.interfaces;

import java.util.List;

import com.cristobal.alkemy.models.entity.PKSubjectTeacher;
import com.cristobal.alkemy.models.entity.SubjectTeacher;

public interface ISubjectTeacherService{
	
	SubjectTeacher registrar(SubjectTeacher subjectTeacher);
	SubjectTeacher modificar(SubjectTeacher subjectTeacher);
	List<SubjectTeacher> listar();
	SubjectTeacher leerPorId(PKSubjectTeacher id);
	boolean eliminar(PKSubjectTeacher id);

}
