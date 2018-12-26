package com.coreJava;
/**
 * Java Shutdown Hook.
 * 
 * The shutdown hook can be used to perform cleanup resource or 
 * save the state when JVM shuts down normally or abruptly. 
 * ***/
public class MultiThreading4  {

	public static void main(String[] args) {
			
		Runtime t = Runtime.getRuntime();
		t.addShutdownHook(new xxxx());
		
		System.out.println("Now main sleeping... press ctrl+c to exit");
		
		try{Thread.sleep(3000);}catch (Exception e) {}  

	}

}

 class xxxx extends Thread{
	 public void run()
		{
			System.out.println("Terminates....");
		}
}


