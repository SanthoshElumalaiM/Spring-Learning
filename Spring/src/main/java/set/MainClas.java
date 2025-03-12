package set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClas {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("setConfig.xml");
		Order o= (Order)context.getBean("o1");
		System.out.println(o);
	}
}
