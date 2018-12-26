package com.string;

public class Test {

	/**
	 * in this prog, all string obj & ref have same hashcode.
	 * **/
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 = "abc";
		String s4 = "abc";
		
		/** == check the object and equals method check the contents. **/
		System.out.println(s1.hashCode()); //96354
		System.out.println(s2.hashCode()); //96354
		System.out.println(s1 == s2); //FALSE.
		System.out.println(s1.equals(s2)); //TRUE.
		
		System.out.println(s3.hashCode()); //96354
		System.out.println(s4.hashCode()); //96354
		System.out.println(s3 == s4); //TRUE
		System.out.println(s3.equals(s4)); //TRUE

	}

}
