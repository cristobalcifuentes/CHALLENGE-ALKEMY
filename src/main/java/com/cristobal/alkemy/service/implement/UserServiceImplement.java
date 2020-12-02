package com.cristobal.alkemy.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobal.alkemy.models.entity.User;
import com.cristobal.alkemy.models.repository.IUserRepository;
import com.cristobal.alkemy.service.interfaces.IUserService;

@Service
public class UserServiceImplement implements IUserService {
	
	@Autowired
	private IUserRepository userRepository;

	@Override
	public User registrar(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public User modificar(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public List<User> listar() {
		
		return userRepository.findAll();
	}

	@Override
	public User leerPorId(Integer id) {
		
		Optional<User> user = userRepository.findById(id);
		return user.isPresent() ? user.get() : new User();
	}

	@Override
	public boolean eliminar(Integer id) {
		
		userRepository.deleteById(id);
		return true;
	}

	@Override
	public Optional<User> getByRut(String rut) {
		
		return userRepository.findByRut(rut);
	}

}
