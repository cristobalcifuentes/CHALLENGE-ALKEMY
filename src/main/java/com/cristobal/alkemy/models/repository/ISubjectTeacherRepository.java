package com.cristobal.alkemy.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cristobal.alkemy.models.entity.PKSubjectTeacher;
import com.cristobal.alkemy.models.entity.SubjectTeacher;

@Repository
public interface ISubjectTeacherRepository extends JpaRepository<SubjectTeacher, PKSubjectTeacher> {

}
