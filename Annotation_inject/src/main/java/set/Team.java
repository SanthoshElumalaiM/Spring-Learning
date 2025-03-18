package set;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
	@Qualifier("m1")
	private Set<String>player1;
	
	@Autowired
	@Qualifier("m2")
	private Set<String>player2;

	@Override
	public String toString() {
		return "Team [name=" + name + ", color=" + color + ", state=" + state + ", game=" + game + ", player1="
				+ player1 + ", player2=" + player2 + "]";
	}

	
	
	
	

}
