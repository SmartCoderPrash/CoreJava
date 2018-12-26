package com.coreJava;

/***
 * 
 * Program of performing two tasks by two threads
 * ***/
class aaa extends Thread{
	public void run()
	{
		System.out.println("class AAA method ");
		System.out.println(Thread.currentThread().getName());
	}
}

class xxx extends Thread{
	public void run()
	{
		System.out.println("class XXX method ");
		System.out.println(Thread.currentThread().getName());
	}
}

public class Multithreading5 {

	public static void main(String[] args) {
		
		aaa t1 = new aaa();
		xxx t2 = new xxx();
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		t2.start();
		

	}

}
