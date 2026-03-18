package com.emp.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.emp.entity.AddressDto;

@FeignClient(name="AddressService", url="http://localhost:9090/")


public interface EmpClient 
{
	@GetMapping("/address")
	
	AddressDto getEmp(@RequestParam int id);
	
}