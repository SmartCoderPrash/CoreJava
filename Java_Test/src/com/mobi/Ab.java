package com.mobi;
import java.util.function.BiFunction; 
/**
 * 
 * 1}In the following example, we have defined a functional interface 
 * and referring a static method to it's functional method say().
 * 
 * 2}In the following example, we are using predefined 
 * functional interface Runnable to refer static method.
 * 
 * 3}You can also override static methods by referring methods. 
 * In the following example, we have defined and overloaded three add methods.
 * */

 //Reference to a Static Method
class xyz{
	public static int add(int a, int b)
	{
		return a*b;
	}
	
	public static float add(int a, float b)
	{
		return a*b;
	}
	
	public static float add(float a, float b)
	{
		return a*b;
	}
}
interface abcd
{
	void say();
}

public class Ab {
	
	public static void saySomething()
	{
		System.out.println("in the static  method referanec");
	}
	
	public static void main(String args[])
	{
		//1
		abcd ref = Ab :: saySomething;
		ref.say();
		
		//2
		Thread t1 = new  Thread(Ab::saySomething); 
		t1.start();
		
		//3
		BiFunction<Integer, Integer, Integer> a = xyz::add;
		int result = a.apply(5, 10);
		System.out.println("result is -->>> "+result);
		
		BiFunction<Float, Integer, Float> b = xyz::add;
		Float result1 = b.apply(20.0f, 10);
		
		BiFunction<Float, Float, Float> c = xyz::add;
		Float result2 = c.apply(20.0f, 10.1f);
		System.out.println("result1 is -->>> "+result1);
		System.out.println("result2 is -->>> "+result2);
		
	}

}
