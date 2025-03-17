package has_a_relationship;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("l")
@Primary
public class Lion implements Animal {
	
	public void sound()
	{
		System.out.println("Lion roar");
	}
	

}
