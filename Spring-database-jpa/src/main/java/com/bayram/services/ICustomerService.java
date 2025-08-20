package com.bayram.services;

import com.bayram.dto.DtoCustomer;

public interface ICustomerService {
	public DtoCustomer findCostumerById(long id);
}
