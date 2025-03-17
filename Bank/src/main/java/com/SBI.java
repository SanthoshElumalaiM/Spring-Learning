package com;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("s")
@Qualifier("sbi")
public class SBI  implements Bank{
	
	public void balance() {
		System.out.println("Account balance is : 100000");
	}
}
