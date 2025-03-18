package prdefinedClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainclass {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
		Team t=(Team) context.getBean("t");
		
		System.out.println(t);
	}
}

