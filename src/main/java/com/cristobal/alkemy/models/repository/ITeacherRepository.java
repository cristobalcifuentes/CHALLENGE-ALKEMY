package com.cristobal.alkemy.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cristobal.alkemy.models.entity.Teacher;

@Repository
public interface ITeacherRepository extends JpaRepository<Teacher, Integer> {

	@Query(value = "SELECT count(*) FROM teacher t JOIN subject s ON t.teacher_id = s.teacher_id where t.teacher_id=?", nativeQuery = true)
	int subjectAsociados(int idTeacher);

	@Query(value = "SELECT s.subject_id FROM teacher t JOIN subject s ON t.teacher_id = s.teacher_id where s.teacher_id=?", nativeQuery = true)
	List<Integer> idsSubjectTeacher(int idTeacher);
}
