package in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context =new AnnotationConfigApplicationContext(Config.class);//Don't give inside the double quotes
	}

}
