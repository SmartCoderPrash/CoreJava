package com.coreJava;

public class InnerClass3 {
	static int data = 50;
	private int aa = 100;
	
	/**static inner class**/
	static class Inner{
		
		public static void msg() {
			System.out.println("data--->> "+data);
			//System.out.println("aa -->> "+aa); //Exception in thread "main" java.lang.Error: Unresolved compilation problem: Cannot make a static reference to the non-static field aa
		}
	}

	public static void main(String[] args) {
		InnerClass3.Inner a = new InnerClass3.Inner();
		a.msg();
	}

}
