package com.emp.rest;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.emp.entity.AddressDto;

import com.emp.entity.EmpService;

@RestController



public class RestController_Emp
{
	
	//Rest Template 
	@Autowired
    RestTemplate restTemplate;
	
	// FeignClient
	
	@Autowired
	EmpClient empClient ;
	
	@GetMapping("/employee")
	public EmpService showEmp(@RequestParam int id)
	{
		
		@Nullable
		// AddressDto forObject = restTemplate.getForObject("http://localhost:9090/address?id=67", AddressDto.class);
		
		AddressDto emp = empClient.getEmp(id);
	
		
		
		
		EmpService empservice = new EmpService();
		
		
		empservice.setId(id);
		
		empservice.setUsername("Prachi");
		
		empservice.setEmail("pmp@123");
		
		empservice.setPassword("356766574455");
		
		//empservice.setAddressdto(forObject);
		
		
		
		empservice.setAddressdto(emp);
		
		
		
		return empservice;
		
	}
}
