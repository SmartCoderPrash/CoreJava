package com.coreJava;

public class switchProg {

	public static void main(String[] args) {
		switchProg.switchfunc("2");
	}
	
	public static void switchfunc(String i)
	{
		switch(i)
		{
		case "1" : System.out.println("CASE 1 RUNNING");
				break;
		case "2" :  System.out.println("CASE 2 RUNNING");
				break;	
		default :
				System.out.println("DEFALUT RUNNING...");
		}
	}

}
