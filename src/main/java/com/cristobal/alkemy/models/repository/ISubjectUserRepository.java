package com.cristobal.alkemy.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cristobal.alkemy.models.entity.PKSubjectUser;
import com.cristobal.alkemy.models.entity.SubjectUser;

public interface ISubjectUserRepository extends JpaRepository<SubjectUser, PKSubjectUser> {
	
	
	@Query(value = "SELECT * FROM subject_user where subject_id=? and user_id=?", nativeQuery = true)
	SubjectUser lerrPorId(int idSubject, int idUser);
	
	
	@Query(value = "SELECT count(*) FROM subject_user where subject_id=? and user_id=?", nativeQuery = true)
	int existe(int idSubject, int idUser);

}
