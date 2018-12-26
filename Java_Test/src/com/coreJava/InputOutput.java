package com.coreJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
/**
 * Java FileOutputStream example 1: write string
 * **/
public class InputOutput {

	public static void main(String[] args) {
		try {
			String src = "Prashant Patil";
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Prashant\\Desktop\\My txt\\Test_InoutOutput\\FileOutputStream1");
			fos.write(src.getBytes());
			fos.close();
			System.out.println("WRITE SUCESSFULLY");
			
			FileInputStream fis = new FileInputStream("C:\\Users\\Prashant\\Desktop\\My txt\\Test_InoutOutput\\FileOutputStream1"); 
			//System.out.println(fis.read());//read single character,its return ASCII value.
			//int i =fis.read();
			//System.out.println((char)i);//read single character
			int j = 0;
			while((j=fis.read())!=-1) { // to display the full text need to comment all above line.
				  System.out.print((char)j);    
				
			}
			
			
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
