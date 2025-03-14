
package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("HasARel.xml");
		
		Person p=(Person)context.getBean("p1");
		System.out.println(p);
	}
}
