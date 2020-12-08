package com.cristobal.alkemy.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cristobal.alkemy.models.entity.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer> {

	@Query(value = "select r.role_id, r.role from role r join users_role ur on r.role_id = ur.role_id where ur.user_id=?", nativeQuery = true)
	List<Role> rolesPorIdUsuario(int idUser);

}
