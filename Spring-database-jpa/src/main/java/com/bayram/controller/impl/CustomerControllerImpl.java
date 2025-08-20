package com.bayram.controller.impl;

import java.util.Optional;
import com.bayram.services.impl.CustomerServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bayram.controller.ICustomerController;
import com.bayram.dto.DtoAddress;
import com.bayram.dto.DtoCustomer;
import com.bayram.entities.Address;
import com.bayram.entities.Customer;
import com.bayram.repository.CustomerRepository;
import com.bayram.services.ICustomerService;


@RestController
@RequestMapping(path = "rest/api/customer")

public class CustomerControllerImpl implements ICustomerController{

    

	@Autowired
   private ICustomerService costumerService;
	
	@Override
     @GetMapping(path = "/list/{id}")	
	public DtoCustomer findCostumerById(@PathVariable long id) {
		
		
		
		return costumerService.findCostumerById(id);
	}

	

}
