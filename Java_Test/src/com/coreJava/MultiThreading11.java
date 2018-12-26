package com.coreJava;


class Program {

	public synchronized void print1() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				try {
					wait();
				} catch (Exception e) {
				}
			}
		}
	}

	public synchronized void print2() {

		for (int i = 10; i < 20; i++) {
			System.out.println(i);
			if (i == 15) {
				try {
					wait();
				} catch (Exception e) {
				}
			}
		}
	}

	public synchronized void print3() {

		for (int i = 20; i < 30; i++) {
			System.out.println(i);
			if (i == 25) {
				try {
					//wait();
					notifyAll();
					wait();
				} catch (Exception e) {
				}
			}
		}
	}

}

public class MultiThreading11 {

	public static void main(String[] args) throws InterruptedException {

		Program program = new Program();

		Thread t1 = new Thread() {
			public void run() {
				program.print1();
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				try {
					Thread.sleep(1000);
					program.print2();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		Thread t3 = new Thread() {
			public void run() {
				try {
					Thread.sleep(2000);
					program.print3();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		t1.setPriority(10);
		// t2.setPriority();
		t3.setPriority(1);

		t1.start();
		t2.start();
		t3.start();
		
		//t3.join();
		//t3.notify();
		

	}

}
