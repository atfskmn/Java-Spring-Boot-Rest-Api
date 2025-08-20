package com.bayram.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bayram.controller.IEmployeeController;
import com.bayram.dto.DtoEmployee;
import com.bayram.services.impl.EmployeeServiceImpl;

@RestController
@RequestMapping("rest/api/employee")
public class EmployeeControllerImpl  implements IEmployeeController{

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	@Override
	@GetMapping(path = "list")
	public List<DtoEmployee> findAllEmployees() {
		
		 return employeeServiceImpl.findAllEmployees();
	}

	
}
