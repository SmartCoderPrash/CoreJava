package com.coreJava;

public class String_method2 {

	public static void main(String[] args) {
		
		String a ="Prash";
		byte[] arr = a.getBytes();
		
		for (int i = 0; i < arr.length ; i++)
		{
			//System.out.println(arr[i]);
		}
		System.out.println(new String(arr));
		
		String b = "this is java n also the is the .net";
		//b.toCharArray();
		//System.out.println(b.replaceAll("i", "@"));
		String_method2.exe(17);
	}
	
	public static void exe(int age)
	{
		  if(age<18)  
		      throw new ArithmeticException("AGE IS NOT VALID");  
		     else  
		      System.out.println("welcome to vote");  
	}

	
}
