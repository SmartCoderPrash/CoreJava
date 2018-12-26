package com.coreJava;

/**Java Member inner class example**/
public class InnerClass1 {
	private int data = 50;
	class Inner
	{
		public void msg()
		{
			System.out.println("data is -->> "+data);
		}
	}
	public static void main(String[] args) {
		
		InnerClass1 i = new InnerClass1();
		
		Inner ii = i.new Inner();
		
		ii.msg();
	}

}
