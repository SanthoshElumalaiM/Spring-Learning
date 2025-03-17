package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("p")
public class Person {
	
	
	@Autowired
	@Qualifier("ib")
	Bank bank1;
	
	@Autowired
	@Qualifier("sbi")
	Bank bank2;
	
	public void getAccountBalance() {
		bank1.balance();
		bank2.balance();
		
	}

}
