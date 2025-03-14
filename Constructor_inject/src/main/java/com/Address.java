package com;

public class Address {
	
	private int dno;
	private String street;
	private String city;
	private long pincod;
	public Address(int dno, String street, String city, long pincod) {
		super();
		this.dno = dno;
		this.street = street;
		this.city = city;
		this.pincod = pincod;
	}
	@Override
	public String toString() {
		return "Address [dno=" + dno + ", street=" + street + ", city=" + city + ", pincod=" + pincod + "]";
	}
	
	

}
