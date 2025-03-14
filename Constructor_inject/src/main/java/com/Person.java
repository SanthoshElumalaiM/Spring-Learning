package com;

public class Person {
	
	private int id;
	private String name;
	private String gender;
	private int age;
	
	private Address address;
	
	Person(int id,String name,String gender,int age,Address address)
	{
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.address=address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address
				+ "]";
	}

	
	
	
}
