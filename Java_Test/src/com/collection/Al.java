package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Al {

	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<>();
		
		Person p = new Person("Prash", "abad", "25");
		Person p1 = new Person("Prash", "abad", "25");
		Person p2 = new Person("Prash", "abad", "25");
		Person p4 = new Person("Prash", "abad", "25");
		
		list.add(p);
		list.add(p1);
		list.add(p2);
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("prash");
		al.add("anand");
		al.add("rushi");
		al.add("ganu");
		
		if (!al.isEmpty())
		{
			System.out.println(list.contains(p4));
			Collections.swap(al, 1, 2);
			for (String pp : al)
			{
				System.out.println("after swap is ->>"+pp);
			}
			}
	
	}

}
