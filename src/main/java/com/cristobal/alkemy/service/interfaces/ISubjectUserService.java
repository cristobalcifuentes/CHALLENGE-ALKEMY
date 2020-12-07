package com.cristobal.alkemy.service.interfaces;

import java.util.List;

import com.cristobal.alkemy.models.entity.PKSubjectUser;
import com.cristobal.alkemy.models.entity.SubjectUser;

public interface ISubjectUserService {
	
	SubjectUser registrar(PKSubjectUser obj);
	SubjectUser modificar(SubjectUser obj);
	List<SubjectUser> listar();
	SubjectUser leerPorId(PKSubjectUser id);
	boolean eliminar(PKSubjectUser id);
	PKSubjectUser crearPK(int idSubject, int idUser);
	Integer existe(PKSubjectUser id);

}
