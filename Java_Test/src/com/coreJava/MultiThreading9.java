package com.coreJava;

/**
 * Example of synchronized method by using annonymous class.
 * **/
class Table_print{
	public synchronized void print(int n) // we also use  "synchronized static" then no need to create the obj of Table_print
	{ 
		for (int i = 1 ; i<=5 ; i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreading9 {

	public static void main(String[] args) {
		final Table_print t = new Table_print();
		
		Thread t1 = new Thread() {
			public void run() {
				t.print(5);
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				t.print(11);
			}
		};
		
		t1.start();
		t2.start();

	}

}
