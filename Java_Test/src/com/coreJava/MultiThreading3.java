package com.coreJava;

public class MultiThreading3 implements Runnable {
	
	public void run()
	{
		System.out.println(" "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		MultiThreading3 m = new MultiThreading3();
		
		ThreadGroup tg = new ThreadGroup("Parent ThreadGroup");
		
		Thread t1 = new Thread(tg, m , "one");
		t1.start();
		Thread t2 = new Thread(tg, m, "two");
		t2.start();
		Thread t3 = new Thread(tg, m,"three");  
        t3.start();
        
		System.out.println("Thread grp -> "+tg.getName());
		 tg.list(); 

	}

}
