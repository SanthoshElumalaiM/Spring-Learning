package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpMainClass {
	public static void main(String[] args) {
		
		ApplicationContext context =new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee d=(Employee)context.getBean("demo");
		d.detail();
				
	}

}
