package com.bayram.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bayram.controller.ICustomerController;
import com.bayram.dto.DtoAddress;
import com.bayram.dto.DtoCustomer;
import com.bayram.entities.Address;
import com.bayram.entities.Customer;
import com.bayram.repository.CustomerRepository;
import com.bayram.services.ICustomerService;


@Service

public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public DtoCustomer findCostumerById(long id) {
	DtoCustomer dtoCustomer =new DtoCustomer();	
	DtoAddress dtoAddress =new  DtoAddress();	
		
	   Optional<Customer> optional= customerRepository.findById(id);
	    if (optional.isEmpty()) {
             return null;			
		}
	    Customer customer=optional.get();
	    Address  address=optional.get().getAddress();
	    
	    BeanUtils.copyProperties(customer, dtoCustomer);
	    BeanUtils.copyProperties(address, dtoAddress);
	     dtoCustomer.setAddress(dtoAddress);
	    return dtoCustomer;
	}

}

