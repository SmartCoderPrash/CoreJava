package com.coreJava;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class InputOutput8 {
/**
 * Java Reader & Java Writer.
 * **/
	public static void main(String[] args) {
		try {

			Writer w = new FileWriter("C:\\Users\\Prashant\\Desktop\\My txt\\Test_InoutOutput\\a.txt");
			w.write("this is writer class string..");
			w.flush();
			w.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Reader r = new FileReader("C:\\Users\\Prashant\\Desktop\\My txt\\Test_InoutOutput\\a.txt");
			int data = r.read();//read one char.
			while (data != -1) {
				System.out.print((char) data);
				data = r.read();
			}
			r.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
