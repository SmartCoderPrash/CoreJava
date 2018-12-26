package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collectiom_Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();  
        list.add("C");  
        list.add("Core Java");  
        list.add("Advance Java");  
        System.out.println("Initial collection value:-->> "+list);  
        
        Collections.addAll(list,  "Servlet","JSP");
        System.out.println("After adding elements collection value:-->> "+list);
        
        String arr[] = {"HTML", "JS"};
        Collections.addAll(list, arr);
        System.out.println("After adding array collection value:==>> "+list);  
        
        Collections.sort(list);
        System.out.println(list);	

	}

}
