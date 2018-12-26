package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hm {

	public static void main(String[] args) {

		
		HashMap<Integer, String> hm =  new HashMap<>();
		
		hm.put(null, null);
		hm.put(null, "nill");
		hm.put(1, "Prash");
		
		HashMap<Integer, String> hm1 = (HashMap<Integer, String>) hm.clone();
		hm1.put(2, "Patil");
		
		System.out.println("size of hashmap is -->> "+hm.size());
		System.out.println("size of hashmap is -->> "+hm1.size());
		
		for (Map.Entry aa : hm1.entrySet())
		{
			System.out.println(aa.getValue());
		}
		
	}

}
