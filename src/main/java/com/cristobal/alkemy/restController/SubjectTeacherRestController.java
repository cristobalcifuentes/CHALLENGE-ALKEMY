package com.cristobal.alkemy.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristobal.alkemy.service.interfaces.ISubjectTeacherService;

@RestController
@RequestMapping("/subject-teacher")
public class SubjectTeacherRestController {
	
	@Autowired
	private ISubjectTeacherService subjectTeacherService;

}
