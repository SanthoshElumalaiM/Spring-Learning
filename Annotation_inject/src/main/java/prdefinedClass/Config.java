package prdefinedClass;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan///it will consider config class which package
public class Config {

	@Bean
	public List<String> m1(){
		
		ArrayList< String> al=new ArrayList<String>();
		
		al.add("Hartik");
		al.add("Rohit");
		al.add("surya");
		al.add("kunal");
		
		
		return al;
		
	}
}
