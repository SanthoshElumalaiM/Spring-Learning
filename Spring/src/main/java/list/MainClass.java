package list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("listConfig.xml");
		
		Order o=(Order)context.getBean("o");
		System.out.println(o);
	}

}
