package has_a_relationship;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("l")
//@Primary replaced by Qualifier
@Qualifier("lion")
public class Lion implements Animal {
	
	public void sound()
	{
		System.out.println("Lion roar");
	}
	

}
