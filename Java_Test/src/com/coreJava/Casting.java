package com.coreJava;

public class Casting {
	public static void main(String[] args) {
		
		int g,h,j,k;
		g=h=j=k=10;
		
		double m = 10; //implicit casting, upcasting, complier is responsible
		int a = 'a'; // it required when we assigning lower data type value to higher data type variable. 
		System.out.println(m);
		System.out.println(a);
		
		byte b = (byte) 130;//explicit casting, downcasting. programmer is responsible.
		System.out.println(b); // it required when we assigning higher data type value to the lower data type variable
		
		double d = 10.101010;
		int i = (int) d;
		System.out.println(i);
		
		System.out.println(k);
	}

}
