package com.coreJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Reading data from console by InputStreamReader and BufferedReader.
 * **/
public class InputOutpurt9 {

	public static void main(String[] args) {
		try {
			InputStreamReader r = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);
			System.out.println("Enter your name: ");
			String name = br.readLine();
			System.out.println("Welcome " + name);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
