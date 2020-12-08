package com.cristobal.alkemy.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cristobal.alkemy.models.entity.User;
import com.cristobal.alkemy.service.interfaces.IUserService;

@Service
public class UserDetalleService implements UserDetailsService{

	
	@Autowired
	private IUserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String rut) throws UsernameNotFoundException {
		
		System.out.println("llego a loadUserByUsername, rut = " + rut);
		
		User user = userService.getByRut(rut).get();
		System.out.println("usuario construido en loadUserByUsername (UserDetalleService) = " + user);
		return UsuarioDetalle.build(user);
	}

}
