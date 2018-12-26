package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LL {

	public static void main(String[] args) {
		try
		{
			
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("Patil");
		ll.add("Prash");
		ll.add("Palkar");
		
		ArrayList<String> al = new ArrayList<>();
		
		ll.addAll(2,al);
		
		System.out.println("SIZE OF THE LL IS --> "+ll.size());
		
		Iterator iterator = ll.descendingIterator();
				
				while(iterator.hasNext())
				{
					System.out.println("==>>"+iterator.next());
				}
	}
	catch(Exception e)
		{
		e.printStackTrace();
		}
	}

}
