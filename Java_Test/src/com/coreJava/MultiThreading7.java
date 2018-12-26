package com.coreJava;
/***
 * Java synchronized method.
 * **/
class Table {
	public synchronized void print(int val) { // for run without syn. then remove the synchronized keyword.
		for (int i = 1; i <= 5; i++) {
			System.out.println(val * i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class myThread1 extends Thread {
	Table t;

	myThread1(Table t) {
		this.t = t;
	}

	public void run() {
		t.print(5);
	}
}

class myThread2 extends Thread {
	Table t;

	myThread2(Table t) {
		this.t = t;
	}

	public void run() {
		t.print(11);
	}
}

public class MultiThreading7 {

	public static void main(String[] args) {

		Table t = new Table();
		
		myThread1 t1 = new myThread1(t);
		myThread2 t2 = new myThread2(t);
		
		t1.start();
		t2.start();
	}

}
