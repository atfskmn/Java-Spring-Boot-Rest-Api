package com.bayram.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bayram.dto.DtoStudent;
import com.bayram.dto.DtoStudentIU;
import com.bayram.entities.Student;



public interface IStudentService {

	
	public DtoStudent saveStudent(DtoStudentIU student);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	
	public DtoStudent updateStudent(Integer id,DtoStudentIU dtoStudentUI);
	
	
}
