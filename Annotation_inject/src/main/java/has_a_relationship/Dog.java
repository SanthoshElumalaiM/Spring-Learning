package has_a_relationship;

import org.springframework.stereotype.Component;

@Component("d")
public class Dog  implements Animal{
	
	public void sound()
	{
		System.out.println("Bark!!!");
	}
}
