package com.coreJava;

public class StaticMember {
	
	int x = 10;
	static int x1 = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void abc() { // use both static and instance member
		System.out.println(x +"  "+x1);
	}

	public static void abcd() {
		System.out.println("  "+x1);//only access or use static member
	}
}
