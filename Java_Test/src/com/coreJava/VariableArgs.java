package com.coreJava;

public class VariableArgs {

	/*public static void main(int[] args)
	{
		System.out.println("in the second main method");
	}*/
	public static void main(String[] args) {
		
		VariableArgs v = new VariableArgs();
		v.m(10);
		v.m(10,20);
		v.m(10,20,30);
	}
	
	
	public void m(int... x)
	{
		//System.out.println("variable arg -->> "+x.length);
		int total = 0;
		for (int i : x)
			total += i;
		
		System.out.println("total is ->> "+total);
	}

}
