package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml ");
		
		Demo d=(Demo)context.getBean("ref");//bean means Object
		
		d.m1();

	}

}
