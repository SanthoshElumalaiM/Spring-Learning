package map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan///it will consider config class which package
public class Config {

	@Bean
//	@Qualifier("m1")
	//Autowired  based on name player1
	public Map<Integer,String> player1(){
		
		LinkedHashMap<Integer,String> al=new LinkedHashMap<Integer,String>();
		
		al.put(1,"Hartik");
		al.put(2,"Rohit");
		al.put(3,"surya");
		al.put(4,"kunal");
		
		
		return al;
		
	}
	@Bean
//	@Primary
//	@Qualifier("m2")

	//Autowired  based on name player2
	public Map<Integer,String> player2(){
		
		LinkedHashMap<Integer,String> al=new LinkedHashMap<Integer,String>();
		
		al.put(5, "bumrah");
		al.put(6, "ishan");
		al.put(7, "boult");
		return al;
		
	}
}
