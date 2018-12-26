package com.coreJava;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;


/**
 * SequenceInputStream example that reads data using enumeration.
 **/
public class InputOutput3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\Prashant\\Desktop\\My txt\\Test_InoutOutput\\a.txt");
			FileInputStream fin2 = new FileInputStream("C:\\Users\\Prashant\\Desktop\\My txt\\Test_InoutOutput\\b.txt");
			FileInputStream fin3 = new FileInputStream("C:\\Users\\Prashant\\Desktop\\My txt\\Test_InoutOutput\\c.txt");
			FileInputStream fin4 = new FileInputStream("C:\\Users\\Prashant\\Desktop\\My txt\\Test_InoutOutput\\d.txt");

			// creating Vector object to all the stream
			@SuppressWarnings("rawtypes")
			Vector vector = new Vector();
			vector.add(fin);
			vector.add(fin2);
			vector.add(fin3);
			vector.add(fin4);

			// creating enumeration object by calling the elements method.
			@SuppressWarnings("rawtypes")
			Enumeration e = vector.elements();

			// passing the enumeration object in the constructor
			SequenceInputStream bin = new SequenceInputStream(e);

			int i = 0;
			while ((i = bin.read()) != -1) {
				System.out.print((char) i);
			}
			bin.close();
			fin.close();
			fin2.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
