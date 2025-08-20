package com.bayram.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bayram.dto.DtoDepartment;
import com.bayram.dto.DtoEmployee;
import com.bayram.entities.Employee;
import com.bayram.repository.EmployeeRepository;
import com.bayram.services.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@Override
	public List<DtoEmployee> findAllEmployees() {
	List<Employee> employeList=	employeeRepository.findAll();
	
		List<DtoEmployee> dtoemployeList=new ArrayList<>();
		if (employeList!=null&& !employeList.isEmpty()) {
			for (Employee employee : employeList) {
				DtoEmployee dtoEmployee=new DtoEmployee();
				
				BeanUtils.copyProperties(employee, dtoEmployee);
				dtoEmployee.setDepartment(new DtoDepartment(employee.getDepartment().getId(),employee.getDepartment().getDepartmentName()));
				
				dtoemployeList.add(dtoEmployee);
			}
			
		}
		
		
		return dtoemployeList;
	}

}
