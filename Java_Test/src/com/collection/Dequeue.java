package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();

		deque.offer("a");  
	    deque.offer("b");  
		deque.add("c");
		deque.add("d");
		deque.add("e");

		deque.pollLast();
		
		for (String str : deque) {
			System.out.println(str);
		}
	}

}
