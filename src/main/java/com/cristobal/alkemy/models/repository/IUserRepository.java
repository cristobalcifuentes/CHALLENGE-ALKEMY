package com.cristobal.alkemy.models.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cristobal.alkemy.models.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByRut(String rut);

}
