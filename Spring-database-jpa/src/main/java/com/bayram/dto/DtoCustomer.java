package com.bayram.dto;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoCustomer {

	
     private long id;
	
    private String name;
    
    private DtoAddress address;
	
}
