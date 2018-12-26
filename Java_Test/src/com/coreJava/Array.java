package com.coreJava;

public class Array {
	public static void main(String[] args) {
		
		int[] []a[],b; // a is 3d n b is 2d
		int [][] d = new int[1][];
		
		int[][][] c = new int[3][2][4];
		System.out.println(c);//[[[I@7852e922 (Hashcode)
		System.out.println(c[2]);//[[I@4e25154f
		System.out.println(c[2][1]);//[I@70dea4e
		System.out.println(c[2][1][1]); // the default val is 0;
		
		int [][] e = new int[1][];
		System.out.println(e); //[[I@5c647e05
		System.out.println(e[0]); //null
		System.out.println(e[0][0]); //java.lang.NullPointerException
		
		Number[] n = new Number[10];
		n[0] = new Integer(11);
		//n[1] = new Number();
		
		System.out.println("done");
	}

}
