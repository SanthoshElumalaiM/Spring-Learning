package com;

import org.springframework.stereotype.Component;

@Component("demo")
public class Employee {
	Employee(){
		System.out.println("Employee constructor called");
	}
	public void detail() {
		System.out.println("Employee Name: Sant Sal:150000");
	}

}
