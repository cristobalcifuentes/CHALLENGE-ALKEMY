package com.cristobal.alkemy.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristobal.alkemy.models.entity.PKUserRole;
import com.cristobal.alkemy.models.entity.UserRole;

public interface IUserRoleRepository extends JpaRepository<UserRole, PKUserRole> {

}
