package com.coreJava;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Java DataOutputStream Class.
 *  
 *	Java DataInputStream Class
 **/
public class InputOutput5 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\Prashant\\Desktop\\My txt\\Test_InoutOutput\\FileOutputStream3");

			DataOutputStream dis = new DataOutputStream(fos);
			dis.writeChars("this is demo of DataOutputStream....");
			dis.writeInt(50);
			dis.flush();
			dis.close();
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\Prashant\\Desktop\\My txt\\Test_InoutOutput\\FileOutputStream3");
			DataInputStream dis = new DataInputStream(fis);

			int count = fis.available();
			byte[] arr = new byte[count];
			dis.read(arr);
			//System.out.println(dis.readInt());
			for (byte bt : arr) {
				char k = (char) bt;
				System.out.print(k);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
