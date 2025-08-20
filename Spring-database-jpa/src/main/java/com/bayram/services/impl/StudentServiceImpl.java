package com.bayram.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import com.bayram.starter.SpringDatabaseJpaApplication;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bayram.dto.DtoStudent;
import com.bayram.dto.DtoStudentIU;
import com.bayram.entities.Student;
import com.bayram.repository.StudentRepository;
import com.bayram.services.IStudentService;


@Service
public class StudentServiceImpl implements IStudentService{

    private final SpringDatabaseJpaApplication springDatabaseJpaApplication;

@Autowired	
private StudentRepository studentRepository;


    StudentServiceImpl(SpringDatabaseJpaApplication springDatabaseJpaApplication) {
        this.springDatabaseJpaApplication = springDatabaseJpaApplication;
    }	
	
	
	@Override
	public DtoStudent saveStudent(DtoStudentIU dtoStudentUI) {
		
	DtoStudent response  = new DtoStudent(); 
	Student student= new Student();	
	BeanUtils.copyProperties(dtoStudentUI, student);
	Student dbStudent=studentRepository.save(student);
	BeanUtils.copyProperties(dbStudent, response);
	
	
	
	return response;
	}


	@Override
	public List<DtoStudent> getAllStudents() {
		
	List<DtoStudent> dtolist=new ArrayList<>(); 
				
  List<Student>studentList=studentRepository.findAll();
     for (Student student : studentList) {
    	 DtoStudent dto=new DtoStudent();
    	 BeanUtils.copyProperties(student, dto);
    	 dtolist.add(dto);
    	 
     }
		return dtolist;
		
	}
		


	@Override
	public DtoStudent getStudentById(Integer id) {
      DtoStudent dto= new DtoStudent();
      
	 Optional<Student> optional=studentRepository.findById(id);
if (optional.isPresent()) {
	Student dbstudent =optional.get();
	BeanUtils.copyProperties(dbstudent,dto);
}
	 return dto;
	}


	@Override
	public void deleteStudent(Integer id) {
	Optional<Student> optional =studentRepository.findById(id);
	if (optional.isPresent()) {
		
		studentRepository.delete(optional.get());
		
	}
	
	}


	@Override
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU) {
    DtoStudent dto =new DtoStudent();
Optional<Student> optional =studentRepository.findById(id);
if (optional.isPresent()) {
	Student dbStudent =optional.get();
	
	
	dbStudent.setFirstName(dtoStudentIU.getFirstName());
	dbStudent.setLastName(dtoStudentIU.getLastName());
	dbStudent.setBirthOfDate(dtoStudentIU.getBirthOfDate());
	
	Student updatedStudent=studentRepository.save(dbStudent);
	BeanUtils.copyProperties(dbStudent, dto);
	
	
	return dto;
	
}
	return null;
}


}
