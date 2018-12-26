package com.mobi;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		String[] str = new String[10];   
        //Getting the substring
		
		Optional<String> o = Optional.ofNullable(str[9]);
		if(o.isPresent())
		{
		
        String str2 = str[9].substring(2, 5);
        //Displaying substring
        System.out.print(str2);
		}
		else
			System.out.println("error in string i.e null pointer execption...");
	}

}
