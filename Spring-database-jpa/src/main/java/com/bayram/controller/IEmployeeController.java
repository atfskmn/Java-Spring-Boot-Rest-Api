package com.bayram.controller;

import java.util.List;

import com.bayram.dto.DtoEmployee;

public interface IEmployeeController {

	
	public List<DtoEmployee> findAllEmployees();
}
