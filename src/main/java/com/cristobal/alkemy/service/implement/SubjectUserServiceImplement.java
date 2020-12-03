package com.cristobal.alkemy.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobal.alkemy.models.entity.PKSubjectUser;
import com.cristobal.alkemy.models.entity.SubjectUser;
import com.cristobal.alkemy.models.repository.ISubjectUserRepository;
import com.cristobal.alkemy.service.interfaces.ISubjectUserService;

@Service
public class SubjectUserServiceImplement implements ISubjectUserService {
	
	@Autowired
	private ISubjectUserRepository subjectUserRepository;

	@Override
	public SubjectUser registrar(SubjectUser subjectUser) {
		
		return subjectUserRepository.save(subjectUser);
	}

	@Override
	public SubjectUser modificar(SubjectUser subjectUser) {
		
		return subjectUserRepository.save(subjectUser);
	}

	@Override
	public List<SubjectUser> listar() {
		
		return subjectUserRepository.findAll();
	}

	@Override
	public SubjectUser leerPorId(PKSubjectUser id) {
		
		Optional<SubjectUser> subjectUser = subjectUserRepository.findById(id);
		return subjectUser.isPresent() ? subjectUser.get() : new SubjectUser();
	}

	@Override
	public boolean eliminar(PKSubjectUser id) {
		
		subjectUserRepository.deleteById(id);
		return true;
	}

	@Override
	public PKSubjectUser crearPK(int idSubject, int idUser) {
		
		return new PKSubjectUser(idSubject, idUser);
	}

}
