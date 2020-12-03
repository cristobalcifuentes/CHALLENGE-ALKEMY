package com.cristobal.alkemy.service.interfaces;

import java.util.List;

import com.cristobal.alkemy.models.entity.PKUserRole;
import com.cristobal.alkemy.models.entity.UserRole;

public interface IUserRoleService {
	
	UserRole registrar(UserRole userRole);
	UserRole modificar(UserRole userRole);
	List<UserRole> listar();
	UserRole leerPorId(PKUserRole id);
	boolean eliminar(PKUserRole id);
	PKUserRole crearPK(int idUser, int idRole);

}
