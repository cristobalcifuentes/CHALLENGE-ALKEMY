package com.cristobal.alkemy.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobal.alkemy.models.entity.PKSubjectUser;
import com.cristobal.alkemy.models.entity.SubjectUser;
import com.cristobal.alkemy.models.repository.ISubjectRepository;
import com.cristobal.alkemy.models.repository.ISubjectUserRepository;
import com.cristobal.alkemy.models.repository.IUserRepository;
import com.cristobal.alkemy.service.interfaces.ISubjectUserService;

@Service
public class SubjectUserServiceImplement implements ISubjectUserService {
	
	@Autowired
	private ISubjectUserRepository subjectUserRepository;
	
	@Autowired
	private ISubjectRepository subjectRepository;
	
	@Autowired
	private IUserRepository UserRepository;

	@Override
	public SubjectUser registrar(PKSubjectUser subjectUser) {
		
		System.out.println("llego el proceso al servicio");
		System.out.println("pk que llega al servicio" + subjectUser);
		
		SubjectUser subjectUSer = new SubjectUser(
				subjectRepository.getOne(subjectUser.getSubject()), 
				UserRepository.getOne(subjectUser.getUser()));
		
		SubjectUser subjectUserRetornado = subjectUserRepository.save(subjectUSer);
		
		System.out.println("salio del servicio");
		return subjectUserRetornado;
				
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
		
		
		
		SubjectUser subjectUser = subjectUserRepository.lerrPorId(id.getSubject(), id.getUser());
		System.out.println("pk que llega al servicio " + id);
		System.out.println("subject user generado ne servicio " + subjectUser);
		return subjectUser;
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

	@Override
	public Integer existe(PKSubjectUser id) {
		
		return subjectUserRepository.existe(id.getSubject(), id.getUser());

		
	}

}
