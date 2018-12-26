package com.coreJava;

import java.io.IOException;

class abc
{
	public void test()throws IOException
	{
		System.out.println("PARENT CLASS METHOD....");
	}
}

public class Execption extends abc {
	
	//@Override
	public void test() throws IOException
	{
		System.out.println("child METHOD ");
	}
	public static void main(String[] args) throws IOException {

		Execption e = new Execption();
		abc a = new Execption();
		e.test();
		a.test();
	}

}
