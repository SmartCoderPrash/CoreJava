package com.mobi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ArrayLsitDemo {

	public static void main(String[] args) {
		List<String> list =
				Collections.synchronizedList( new ArrayList<String>());
		
		list.add("jude");
		list.add("Prnit");
		list.add("prashant");
		
		/*synchronized (list) {
			Iterator<String> iterator = list.iterator();
			
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
		}*/
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		/*ArrayList<String> list1 = new ArrayList<String>();
		list1.add("jude");*/
		
		
	}

}
