package com.coreJava;

class Example extends Thread {
	
	Example()
	{
		super("my extending thread....");
		System.out.println("my thread created" + this);
	    start();
	}
	
	public void run()
	{
		try
		{
			for (int i=0 ;i<10;i++)
	        {
	           System.out.println("Printing the Child " + i);
	           Thread.sleep(1000);
	        }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 System.out.println("MY THREAD RUN IS OVER" );
	}

}

class MultiThreading
{
	public static void main(String args[])
	{
		Example m = new Example();
		try
		{
			while(m.isAlive())
			{
				 System.out.println("Main thread will be alive till the child thread is live");
		         Thread.sleep(1500);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 System.out.println("MAIN THREAD'S RUN IS OVER" );
	}
	
}
