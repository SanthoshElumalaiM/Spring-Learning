package has_a_relationship;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ZooMainClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(ZooConfig.class);
		
		Zoo z=(Zoo)context.getBean("z");
		
		z.getAnimalSound();
	
	}
	
		
	  
	
	
	
}
