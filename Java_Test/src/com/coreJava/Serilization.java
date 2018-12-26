package com.coreJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serilization {

	public static void main(String[] args) {

		PersonCls p = new PersonCls(1, 25, "Prash", "Abad", 172);
		PersonCls pp = null;
		try {
			/**Serialization of Object**/
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Prashant\\Desktop\\My txt\\Pserson.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			oos.close();
			System.out.println("Serialzation Done!!");
			
			/**De-serialization of Object**/
			FileInputStream fis = new FileInputStream("C:\\Users\\Prashant\\Desktop\\My txt\\Pserson.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			pp = (PersonCls) ois.readObject();
			ois.close();
			System.out.println("-->> "+pp.getStuName());
			System.out.println("De-Serialzation Done!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
