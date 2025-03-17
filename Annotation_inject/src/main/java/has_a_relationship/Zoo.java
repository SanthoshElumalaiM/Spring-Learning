package has_a_relationship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("z")
public class Zoo {
	
	@Autowired
	@Qualifier("dog")
	Animal animal1;//new dog()
	
	@Autowired
	@Qualifier("lion")
	Animal animal2;//new lion()
	
	public void getAnimalSound() {
		animal1.sound();
		animal2.sound();
		
		
	}

}
