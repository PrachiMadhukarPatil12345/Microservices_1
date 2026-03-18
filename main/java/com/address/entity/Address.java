package com.address.entity;

import lombok.Data;

@Data
public class Address 
{
	  private Long id;

	    private String houseNumber;
	    private String street;
	    private String area;
	    private String city;
	    private String state;
	    private String country;
	    private String postalCode;
}
