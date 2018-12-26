package com.coreJava;

public class ArrayProg {

	public static void main(String[] args) {
		/*char[] arr = { 'a', 'b', 'c', 'd' };
		char cpyArr[] = new char[4];

		System.arraycopy(arr, 0, cpyArr, 0, 4);
		System.out.println(new String(cpyArr));*/
		System.out.println("Factorial of 5 is: "+fact(5)); 
		
		String a = "Prashant";
		a = a.concat(" palkar");
		System.out.println(a);
		
		StringBuffer str =new StringBuffer(a);
		//System.out.println(str.reverse());
		System.out.println(str.insert(9, "Patil "));
	}
	
	public static int fact(int no)
	{
		if (no == 1)
			return 1;
		else 
			return (no * fact(no-1));
	}

}
