package com.cristobal.alkemy.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cristobal.alkemy.models.entity.Subject;

@Repository
public interface ISubjectRepository extends JpaRepository<Subject, Integer> {
	

	@Query(value = "SELECT count(*) FROM subject_user where subject_id=?", nativeQuery = true)
	int cuposTomados(int idSubjec);
	
	

	@Query(value = "select * from subject s join subject_user su on s.subject_id= su.subject_id where su.user_id=?", nativeQuery = true)
	List<Subject> cursosPorAlumno(int idUSer);

}
