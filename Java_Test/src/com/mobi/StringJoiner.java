package com.mobi;

/**
 *  Joining strings by specifying delimiter
 * 
 * Adding prefix and suffix to the output String
 * **/
public class StringJoiner {

	public static void main(String[] args) {

		java.util.StringJoiner s= new java.util.StringJoiner("#", "$", "$");
		//s.add("Prash");
		//s.add("Palkar");
		//s.add("Patil");
		
		s.setEmptyValue("default val");
		
		System.out.println(s);
	}

}
