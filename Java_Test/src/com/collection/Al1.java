package com.collection;

import java.util.ArrayList;
import java.util.*;


public class Al1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Prash");
		al.add("Anand");
		al.add("Ganesh");
		al.add("Rushi");
		
		for (String sr : al) {
			//System.out.println("-->> "+sr);
		}
		
		Iterator iterator = al.iterator();
		while(iterator.hasNext())
		{
			//System.out.println(iterator.next());
		}
		
	}

}
