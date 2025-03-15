package has_a_relationship;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(PersonConfig.class);
		Person p=(Person)context.getBean("person");
		System.out.println(p);
		
	}
}
