package com.coreJava;

import java.io.Console;  
/**
 * Java Console Example.
 * **/
public class InputOutput6 {

	public static void main(String[] args) {
	  /*  // create a new object stream class for Integers  
		ObjectStreamClass osc = ObjectStreamClass.lookup(PersonCls.class);
		
		//PersonCls ps = new PersonCls(1, 25, "Anand", "Thane", 172);
		
	    // create a new object stream class for Integers  
		System.out.println(osc.getField("stuRollNum"));
		//System.out.println(osc.getName("stuName"));
*/	
		
		Console c=System.console();    
		System.out.println("Enter your name: ");    
		String n = c.readLine();    
		System.out.println("Welcome "+n); 
		
		//Java Console Example to read password
		Console cc=System.console();    
		System.out.println("Enter password: ");    
		char[] ch=cc.readPassword();    
		String pass=String.valueOf(ch);//converting char array into string    
		System.out.println("Password is: "+pass);  
	}

}
