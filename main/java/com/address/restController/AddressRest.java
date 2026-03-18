package com.address.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.address.entity.Address;




@RestController

public class AddressRest 
{

	@GetMapping("/address")
	public Address ShowAddress(@RequestParam long id)
	{
		Address  address  = new Address ();
		
		address.setId(id);
		
		address.setHouseNumber("221B");
		
	    address.setStreet("Baker Street");
	    
	    address.setArea("Central Area");
	    
	    address.setCity("London");
	    
	    address.setState("Greater London");
	    
	    address.setCountry("UK");
	    
	    address.setPostalCode("NW16XE");
		
		return address;
	}
	
	
	
}