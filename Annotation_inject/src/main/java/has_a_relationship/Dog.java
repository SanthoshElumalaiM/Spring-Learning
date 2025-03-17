package has_a_relationship;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("d")
//@Primary
@Qualifier("dog")
public class Dog  implements Animal{
	
	public void sound()
	{
		System.out.println("Bark!!!");
	}
}
