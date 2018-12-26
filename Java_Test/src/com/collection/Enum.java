package com.collection;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Set;
/**
 * Java EnumSet Example: allOf() 
 * 
 * */
enum days {  
	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
	}  

public class Enum {

	public static void main(String[] args) {
		Set<days> days = EnumSet.allOf(days.class);
		System.out.println("Week days -->> "+days);
		
		 EnumMap<days, Integer> map = new EnumMap<days, Integer>(days.class); 
		// map.put(days.MONDAY, 1);
		 
		 for (int i = 7; i>=0 ; i--) {
			 for (int j = 0; j<=i; j++) {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
	}

}
