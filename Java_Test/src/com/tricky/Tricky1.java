package com.tricky;
class Test { 
	   int i; 
	   Test t; 
	   boolean b; 
	   byte bt; 
	   float ft; 
	} 

public class Tricky1 {

	public static void main(String[] args) {

	      Test t = new Test(); // default constructor is called. 
	      System.out.println(t.i); //0
	      System.out.println(t.t); //null
	      System.out.println(t.b); //false
	      System.out.println(t.bt); //0
	      System.out.println(t.ft); //0.0
	}

}
