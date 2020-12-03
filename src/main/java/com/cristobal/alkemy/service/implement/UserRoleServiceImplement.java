package com.cristobal.alkemy.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobal.alkemy.models.entity.PKUserRole;
import com.cristobal.alkemy.models.entity.UserRole;
import com.cristobal.alkemy.models.repository.IUserRoleRepository;
import com.cristobal.alkemy.service.interfaces.IUserRoleService;

@Service
public class UserRoleServiceImplement implements IUserRoleService{
	
	@Autowired
	private IUserRoleRepository UserRoleRepository;

	@Override
	public UserRole registrar(UserRole userRole) {
		
		return UserRoleRepository.save(userRole);
	}

	@Override
	public UserRole modificar(UserRole userRole) {
		
		return UserRoleRepository.save(userRole);
	}

	@Override
	public List<UserRole> listar() {
		
		return UserRoleRepository.findAll();
	}

	@Override
	public UserRole leerPorId(PKUserRole id) {
		
		Optional<UserRole> userRole = UserRoleRepository.findById(id);
		return userRole.isPresent() ? userRole.get() : new UserRole();
	}

	@Override
	public boolean eliminar(PKUserRole id) {
		
		UserRoleRepository.deleteById(id);
		return true;
	}

	@Override
	public PKUserRole crearPK(int idUser, int idRole) {
		
		
		return new PKUserRole(idUser, idRole);
	}

}
