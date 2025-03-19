package life;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class LifeCycle {
	
	@PostConstruct
	public void  m1() {
		System.out.println("Hi This is init method");
	}
	
	@PreDestroy
	public void m2() {
		System.out.println("Hi This is Destroy method");
	}
	public void m3() {
		System.out.println("hello world");
	}


}
