package com.coreJava;

/***Sleep method in java
 * 
 * if you sleep a thread for the specified time,
 * the thread shedular picks up another thread and so on.
 * 
 * The join() method waits for a thread to die. In other words, 
 * it causes the currently running threads to stop executing until 
 * the thread it joins with completes its task.***/
public class MultiTjreading1 extends Thread {
	
	public void run()
	{
		for (int i = 0; i<=5; i++)
		{
			try
			{
				Thread.sleep(1000);
				//System.out.println(i);
				System.out.println(Thread.currentThread().getName());
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MultiTjreading1 t1 = new MultiTjreading1();
		MultiTjreading1 t2 = new MultiTjreading1();
		MultiTjreading1 t3 = new MultiTjreading1();
		
		t1.start();
		t2.start();
		t3.start();
		//t1.run(); //there is no context-switching because here t1 and t2 will be treated as normal obtect not thread object.
		//t2.run();
		
		t1.setName("t1"); //is used to change the name of a thread.
		t2.setName("t2");
		t3.setName("t3");
		try
		{
			t1.join(2000);//As you can see in the above example,when t1 completes its task then t2 and t3 starts executing.
					//when t1 is completes its task for 2000 miliseconds(3 times) then t2 and t3 starts executing.
			//t2.join(2000);//JOIN IS USED TO STOP OR COMPLETE THE TASK AFTER COMPLETING THE OHER THREADS.
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
