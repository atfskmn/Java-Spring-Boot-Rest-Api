package com.bayram.services;

import java.util.List;

import com.bayram.dto.DtoEmployee;
import com.bayram.entities.Employee;

public interface IEmployeeService {

	
	
	public List<DtoEmployee> findAllEmployees();
}
