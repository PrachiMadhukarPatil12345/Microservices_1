package com.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@EnableFeignClients
@EnableFeignClients(basePackages = "com.emp.rest")
@SpringBootApplication
public class EmpServiceApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(EmpServiceApplication.class, args);
		
		
	}
	
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
	
	
}
