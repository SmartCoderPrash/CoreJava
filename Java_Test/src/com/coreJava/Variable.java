package com.coreJava;

public class Variable {

	int x = 10;
	static int y = 20;
	
	public static void main(String[] args) {
	
		Variable v =  new Variable();
		v.x = 30;
		v.y = 40;
		System.out.println(v.x);//30
		System.out.println(v.y);//40
		
		Variable v1 =  new Variable();
		System.out.println(v1.x);//10 (different to object to object)
		System.out.println(v1.y);//40 (same to the object)
		
	}

}
