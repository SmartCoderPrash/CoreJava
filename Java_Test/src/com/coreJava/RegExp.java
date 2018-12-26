package com.coreJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

	public static void main(String[] args) {

		String testString = "This is test string for regexp.";
		
		String regex = ".*TEST.*";
		
		/*** TO MATCH THE SENSITIVE CHAR ***/
		boolean isMatch = Pattern.matches(regex, testString);
		System.out.println("-->>> "+isMatch);
		
		/*** TO MATCH THE INSENSITIVE CHAR ***/
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(testString);
		boolean isMatched = matcher.matches();
		
		System.out.println("-->>> "+isMatched);
		
		/***returns true if the string contains of three letters ***/
		   System.out.println(
		     Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aPz"));//True
		   System.out.println(
		     Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aAA"));//True
		   System.out.println(
			 Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "afdp"));//False
		   
		   
		   System.out.println( Pattern.matches("[pqr]", "p"));
		   
		   System.out.println("--------------------------------------------");
		   
		   /* Returns true if the string matches exactly "tim" 
		    * or "Tim" or "jin" or "Jin"
		    */
		   System.out.println(
		     Pattern.matches("[tT]im|[jJ]in", "Tim"));//True
		   System.out.println(
		     Pattern.matches("[tT]im|[jJ]in", "jin"));//True
		   
		   String aaa= "prash";
		   String bbb =  "prashant";
		   System.out.println("compare to -->> "+aaa.compareTo(bbb));
			
	}

}
