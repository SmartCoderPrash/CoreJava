package com.coreJava;
/**
 * Example of synchronized block.
 * **/

class Table111 {

	void printTable(int n) {
		synchronized (this) {// synchronized block
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}// end of the method
}

class MyThread11 extends Thread {	
	Table111 t;

	MyThread11(Table111 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread22 extends Thread {
	Table111 t;

	MyThread22(Table111 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class MultiTreading8 {

	public static void main(String[] args) {

		Table111 t = new Table111();
		MyThread11 t1 = new MyThread11(t);
		MyThread22 t2 = new MyThread22(t);
		//MyThread11 t3 = new MyThread11(t);
		//MyThread22 t4 = new MyThread22(t);
		
		t1.start();
		t2.start();
		//t3.start();
		//t4.start();
		
	}

}
