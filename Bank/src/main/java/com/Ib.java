package com;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("i")
@Qualifier("ib")
public class Ib  implements Bank{
	
	public void balance()
	{
		System.out.println("IB Account balance is =220000");
	}

}
