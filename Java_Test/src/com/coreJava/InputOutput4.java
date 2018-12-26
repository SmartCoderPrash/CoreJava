package com.coreJava;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

/**
 * ByteArrayOutputStream Class
 * **/
public class InputOutput4 {

	public static void main(String[] args) {
		try {
		 FileOutputStream fout1=new FileOutputStream("C:\\\\Users\\\\Prashant\\\\Desktop\\\\My txt\\\\Test_InoutOutput\\\\a.txt");    
	     FileOutputStream fout2=new FileOutputStream("C:\\\\Users\\\\Prashant\\\\Desktop\\\\My txt\\\\Test_InoutOutput\\\\b.txt"); 
		
	     String src ="This is demo";
	     ByteArrayOutputStream baos =  new ByteArrayOutputStream();
	     baos.write(src.getBytes());
	     baos.writeTo(fout1);
	     baos.writeTo(fout2);
		baos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
