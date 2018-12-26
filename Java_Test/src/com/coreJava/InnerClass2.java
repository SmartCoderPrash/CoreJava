package com.coreJava;

public class InnerClass2 {
	private int data = 50;
	public void show() {
		
		class Inner{
			
			public void msg() {
				System.out.println("data -->> "+data);
			}
		}
		
		Inner i = new Inner();
		i.msg();
	}

	public static void main(String[] args) {
		InnerClass2 i = new InnerClass2();
		i.show();
	}

}
