package life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) 
	{
		
		 ApplicationContext context=new AnnotationConfigApplicationContext(LifeConfig.class);
		 
		 LifeCycle l=(LifeCycle)context.getBean("lifeCycle");
		 LifeCycle l1=(LifeCycle)context.getBean("lifeCycle");
		 l.m3();
		 System.out.println(l);
		 System.out.println(l1);
		 
	}
}
