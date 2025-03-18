package prdefinedClass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("t")
public class Team {
	
	@Value("MI")
	private String name;
	@Value("Blue")
	private String color;
	@Value("Mumbai")
	private String state;
	@Value("cricket")
	private String game;
	
	@Autowired
	private List<String>players;

	@Override
	public String toString() {
		return "Team [name=" + name + ", color=" + color + ", state=" + state + ", game=" + game + ", players="
				+ players + "]";
	}
	
	
	

}
