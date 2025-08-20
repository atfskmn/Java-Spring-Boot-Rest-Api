package com.bayram.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bayram.controller.IHomeController;
import com.bayram.dto.DtoHome;
import com.bayram.repository.HomeRepository;
import com.bayram.services.IHomeService;


@RestController
@RequestMapping(path = "rest/api/home")
public class HomeControllerImpl implements IHomeController {

	
	@Autowired
    private IHomeService homeService;


    

	
	
	@GetMapping(path = "/{id}")
	@Override
	public DtoHome findHomeById(@PathVariable(name = "id") long id) {
		
		
		
		return homeService.findHomeById(id);
	}

}
