package map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("mapConfig.xml");
		
		Hotel h=(Hotel)context.getBean("h1");
		System.out.println(h);
	}

}
