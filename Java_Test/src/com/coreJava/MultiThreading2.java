package com.coreJava;

public class MultiThreading2 extends Thread {
	
	public void run()
	{
		for (int i = 0; i<3; i++)
		{
			System.out.println("---> "+Thread.currentThread().getName());  
			//System.out.println("THREAD PRIORITY IS---> "+Thread.currentThread().getPriority());  
			if (Thread.currentThread().isDaemon())
				System.out.println("Demon thread is running...");
			else 
				System.out.println("NORMAL THREAD IS RUNNING...");
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			System.out.println("-----------------------------------------");

		}
	}

	public static void main(String[] args) {
		
		MultiThreading2 t1 = new MultiThreading2();
		MultiThreading2 t2 = new MultiThreading2();
		MultiThreading2 t3 = new MultiThreading2();
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		
		//t1.setPriority(MIN_PRIORITY);
		//t2.setPriority(MAX_PRIORITY);
		
		t1.setDaemon(true);//now t1 is daemon thread  
		
		t1.start();
		t2.start();
		t3.start();
	}

}
