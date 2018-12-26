package com.coreJava;

import java.util.HashMap;
import java.util.HashSet;

public class String_method {

	public static void main(String[] args) {
		/*String str1 = "First String";
		String str2 = "Second String";
		StringBuffer str3 = new StringBuffer("Second String");
		StringBuffer str4 = new StringBuffer("First String");
		System.out.println("str1 equals to str3:" + str1.contentEquals(str3));
		System.out.println("str2 equals to str3:" + str2.contentEquals(str3));
		System.out.println("str1 equals to str4:" + str1.contentEquals(str4));
		System.out.println("str2 equals to str4:" + str2.contentEquals(str4));*/
		
		String abc= "Prashant";
		//String_method.reverse(abc);
		String_method.duplicate(abc);
	}
	
	public static String reverse(String src)
	{
		String src1 = new String(src);
		String src2 = "";
		
		System.out.println(src1.length());
		int size = src1.length();
		for (int i = size-1; i>=0; i--)
		{
			src2 += src1.charAt(i);
			System.out.println(src1.charAt(i));
		}
		System.out.println("new String is -->> "+src2);
		return null;
	}
	
	public static String duplicate(String src)
	{
		char arr[] = src.toCharArray();
		System.out.println("size of array is -->> "+arr.length);
		
		HashSet<Character> set = new HashSet<>();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++)
		{
			if(set.contains(arr[i]))
			{
				map.put(arr[i], i);
			}
			else
				set.add(arr[i]);
		}
		
		System.out.println("map size is -->> "+map.size());
		
		return null;
	}

}
