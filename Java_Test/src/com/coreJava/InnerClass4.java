package com.coreJava;

interface abcd
{
	public void show();
	interface xyz
	{
		public void msg();
	}
}

public class InnerClass4 implements abcd.xyz{

	public static void main(String[] args) {
		abcd.xyz aa = new InnerClass4();
		aa.msg();
	}

	@Override
	public void msg() {
		System.out.println("in the msg method....");
	}

}
