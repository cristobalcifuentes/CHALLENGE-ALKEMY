package com.cristobal.alkemy.service.interfaces;

import java.util.Optional;

import com.cristobal.alkemy.models.entity.User;

public interface IUserService extends ICRUDService<User> {
	
	public Optional<User> getByRut(String rut);

}
