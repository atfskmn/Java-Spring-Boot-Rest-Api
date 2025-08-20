package com.bayram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bayram.entities.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
	

}
