package com.cristobal.alkemy.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristobal.alkemy.models.entity.PKSubjectUser;
import com.cristobal.alkemy.models.entity.SubjectUser;

public interface ISubjectUserRepository extends JpaRepository<SubjectUser, PKSubjectUser> {

}
