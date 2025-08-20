package com.bayram.controller;

import java.security.PublicKey;
import java.util.List;
import java.util.concurrent.Flow.Publisher;

import com.bayram.dto.DtoStudent;
import com.bayram.dto.DtoStudentIU;
import com.bayram.entities.Student;

public interface IStudentController{

	
	public DtoStudent saveStudent(DtoStudentIU dtoStudent);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id,DtoStudentIU dtoStudentUI);

}
