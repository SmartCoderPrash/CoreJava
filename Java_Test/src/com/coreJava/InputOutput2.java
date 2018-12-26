package com.coreJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;

public class InputOutput2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\\\Users\\\\Prashant\\\\Desktop\\\\My txt\\\\Test_InoutOutput\\\\FileOutputStream1");
			FileInputStream fis1 = new FileInputStream("C:\\\\Users\\\\Prashant\\\\Desktop\\\\My txt\\\\Test_InoutOutput\\\\FileOutputStream2");
			SequenceInputStream sis = new SequenceInputStream(fis, fis1);
			
			FileOutputStream fout=new FileOutputStream("D:\\testout.txt"); // reads the data from two files and writes into another file
			int i = 0;
			while((i = sis.read()) != -1) {
				System.out.print(+(char)i);
				  fout.write(i);  //writes into another file
			}
		
			sis.close();
			fis.close();
			fis1.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
