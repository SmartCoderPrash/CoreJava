package com.mobi;

interface aaa
{
	void say();
}

public class InstanceRef {

	public void saySomething()
	{
		System.out.println("this is non-static method...");
	}
	
	public static void main(String args[])
	{
		InstanceRef a = new InstanceRef();// Creating object  
		 // Referring non-static method using reference  
		aaa ref = a::saySomething;
		// Calling interface method  
		ref.say();
		
		// Referring non-static method using anonymous object  
		aaa ref2 = new InstanceRef()::saySomething; // You can use anonymous object also  
		ref2.say();
		
		Thread t = new Thread(new InstanceRef()::saySomething);
		t.start();
		
	}
}
