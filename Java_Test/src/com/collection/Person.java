package com.collection;

public class Person {
	
	public String name;
	public String add;
	public String age;
	
	
	public Person(String name, String add, String age) {
		super();
		this.name = name;
		this.add = add;
		this.age = age;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	

}
