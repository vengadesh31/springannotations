package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigureDemo 
{
	@Bean(name="employee")
	public Employee getEmployeeBean()
	{
		System.out.println("Spring annotation the mployee and bean created");
		return new Employee();
	}
}