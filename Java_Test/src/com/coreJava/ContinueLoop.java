package com.coreJava;

public class ContinueLoop {

	final static int y;
	
	static
	{
		y =100;
	}
	
	public static void main(String[] args) {
		int x = 0;
		do
		{
			x++;
			System.out.println("x ->-->"+x);
			if (++x < 5)
				continue;
			x++;
			System.out.println("x ==>> "+x);
			
		}
		while(++x < 10);
	}

}
