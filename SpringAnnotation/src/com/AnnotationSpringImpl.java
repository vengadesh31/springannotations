package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Employee;

public class AnnotationSpringImpl
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com");
		
		context.refresh();
	
		Employee employee=(Employee)context.getBean("employee");
		
		employee.setEmpId("S1911");
		employee.setEmpName("Vengadesh");
		employee.setSalary(40000);
		
		System.out.println("Employee ID:"+employee.getEmpId());
		System.out.println("Employee Name:"+employee.getEmpName());
		System.out.println("Employee Salary:"+employee.getSalary());
	}
}