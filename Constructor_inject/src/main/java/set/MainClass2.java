package set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass2 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("setConfig.xml");
		
		Order o=(Order)context.getBean("o");
		System.out.println(o);
	}

}
