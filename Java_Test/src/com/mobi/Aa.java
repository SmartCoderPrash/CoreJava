package com.mobi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/***
 * 
 *This is class contains the use of lambda expression.
 *
 * @author prashant
 *
 */

//@FunctionalInterface
interface abc{
	 public String hello();
}

 interface abc1{
	 public int add5(int no);
 }
 
 interface abc2{
	 public int sum(int a, int b);
 }
public class Aa {
	
	public static void main(String args[])
	{
		//Java Lambda Expression with no parameter
		abc ref = () -> "hello"; 
		System.out.println(ref.hello());
		
		//Java Lambda Expression with single para.
		abc1 ref1 = (no) -> no+5;
		System.out.println(ref1.add5(5));
		
		////Java Lambda Expression with multiple para.
		abc2 ref2 =(no1, no2) -> {
								System.out.println("val one is --> "+no1);
								System.out.println("val second is --> "+no2);
									return no1+no2;
								};
		System.out.println(ref2.sum(10, 10));
		
		//Java Lambda Expression with Ruunable.
		Runnable ref3 = () -> System.out.println("in thread");
		new Thread(ref3).start();
		
		//Iterating collections using foreach loop
		List<String> list=new ArrayList<String>(); 
		list.add("abc");
		list.add("pqr");
		list.add("xyz");
		
		 /***Iterate without using Lambda**/
		 Iterator iterator = list.iterator();
		 while (iterator.hasNext()) {
			System.out.println(iterator.next());
		 } 
	 
		
		list.forEach((names) -> System.out.println(names));
		
		
		//Iterating Map in Java 8 using Lambda expression
		Map<String, Integer> map = new HashMap<>();
		map.put("Prash", 1);
		map.put("Patil", 2);
		map.put("Palkar", 3);		
		
		/**without lambda**/
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
		
		/**with lambda**/
		map.forEach((k,v) -> System.out.println("key: "+k+" val: "+v));
		
		
		
	}

}
