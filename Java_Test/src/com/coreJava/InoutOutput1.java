package com.coreJava;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
/**
 * BufferedOutputStream & inputStream Class with FileOutputStream
 * **/
public class InoutOutput1 {

	public static void main(String[] args) {
		
		String src = "Prashant Palkar";
		
		try {
			FileOutputStream fis = new FileOutputStream("C:\\Users\\Prashant\\Desktop\\My txt\\Test_InoutOutput\\FileOutputStream2");
			BufferedOutputStream bos = new BufferedOutputStream(fis);
			
			//OutputStream os = new BufferedOutputStream(new FileOutputStream("C:\\\\Users\\\\Prashant\\\\Desktop\\\\My txt\\\\Test_InoutOutput\\\\FileOutputStream2")); 
					// ITS IS SAME AS ABOVE 2 LINES.
			bos.write(src.getBytes());
			bos.flush();
			bos.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Prashant\\Desktop\\My txt\\Test_InoutOutput\\FileOutputStream2");
			BufferedInputStream boi = new BufferedInputStream(fis);
			int i = 0;
			while((i = boi.read()) != -1) {
				System.out.print(""+(char)i);
			}
			boi.close();
			fis.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
