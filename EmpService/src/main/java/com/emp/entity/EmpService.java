package com.emp.entity;

import lombok.Data;

@Data
public class EmpService
{
	private int  id;
	
	private String Username;
	
	private String Password;
	
	private String Email;
	
	private AddressDto Addressdto;

}
