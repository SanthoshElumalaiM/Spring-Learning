package has_a_relationship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("z")
public class Zoo {
	
	@Autowired
	Animal animal;
	
	public void getAnimalSound() {
		animal.sound();
		
		
	}

}
