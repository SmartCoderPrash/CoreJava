package com.coreJava;

public class String_Equals {
	/**
	 * string equals() method compares the two given strings based on the content of
	 * the string.-->>Case-sensitive. If any character is not matched, it returns
	 * false. If all characters are matched, it returns true. The String equals()
	 * method overrides the equals() method of Object classss.
	 * 
	 * 
	 * The = = operator compares references not values.
	 * 
	 * The String compareTo() method compares values lexicographically and returns
	 * an integer value that describes if first string is less than, equal to or
	 * greater than second string. It compares strings on the basis of Unicode value
	 * of each character in the strings. Suppose s1 and s2 are two string variables.
	 * If:
	 * 
	 * s1 == s2 :0 s1 > s2 :positive value s1 < s2 :negative value
	 **/
	public static void main(String[] args) {

	/*	String s1 = "javatpoint";
		String s2 = "javatpoint";
		String s3 = "JAVATPOINT";
		String s4 = "python";
		String s5 = new String("javatpoint");
		String s6 = new String("JAVATPOINT");

		*//** EQUALS() **//*
		System.out.println(s1.equals(s2));// true because content and case is same
		System.out.println(s1.equals(s3));// false because case is not same
		System.out.println(s1.equals(s4));// false because content is not same
		System.out.println(s1.equals(s5));// true because content is same
		System.out.println(s1.equals(s6));// false because content is not same

		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println();

		*//** == **//*
		System.out.println(s1 == s2);// true (because both refer to same instance)
		System.out.println(s3 == s2);// false.(because both reference is not same)
		System.out.println(s5 == s2);// false.(because both reference is not same)
		System.out.println(s5 == s6);// false.

		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println();

		*//** compareTo() **//*
		String p1 = "hello";
		String p2 = "hello";
		String p3 = "meklo";
		String p4 = "hemlo";
		String p5 = "flag";
		System.out.println(p1.compareTo(p2));// 0 because both are equal
		System.out.println(p1.compareTo(p3));// -5 because "h" is 5 times lower than "m"
		System.out.println(p1.compareTo(p4));// -1 because "l" is 1 times lower than "m"
		System.out.println(p1.compareTo(p5));// 2 because "h" is 2 times greater than "f"
*/		
		System.out.println(String_Equals.isPalindromeString("121"));

	}

	private static boolean isPalindromeString(String str) {
		if (str == null)
			return false;
		int length = str.length();
		System.out.println(length / 2);
		for (int i = 0; i < length / 2; i++) {

			if (str.charAt(i) != str.charAt(length - i - 1))
				return false;
		}
		return true;
	}

}
