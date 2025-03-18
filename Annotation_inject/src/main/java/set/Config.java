package set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan///it will consider config class which package
public class Config {

	@Bean
	@Qualifier("m1")
	public Set<String> m1(){
		
		LinkedHashSet< String> al=new LinkedHashSet<String>();
		
		al.add("Hartik");
		al.add("Rohit");
		al.add("surya");
		al.add("kunal");
		
		
		return al;
		
	}
	@Bean
//	@Primary
	@Qualifier("m2")
	
	public LinkedHashSet<String> m2(){
		
		LinkedHashSet< String> al=new LinkedHashSet<String>();
		
		al.add("Bumrah");
		al.add("Boult");
		al.add("ishan");
		al.add("aswin");
		
		
		return al;
		
	}
}
