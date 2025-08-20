package com.bayram.controller;

import com.bayram.dto.DtoCustomer;

public interface ICustomerController {

	
	public DtoCustomer findCostumerById(long id);
}
