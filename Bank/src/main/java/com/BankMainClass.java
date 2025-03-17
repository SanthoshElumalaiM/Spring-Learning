package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankMainClass {
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(BankConfig.class);
		Person p=(Person)context.getBean("p");
		p.getAccountBalance();
	}

}
