package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(ProductConfig.class);
		
		Product p=(Product)context.getBean("p");
		System.out.println(p);
		
	}
}
