package com.coreJava;

import java.io.FilePermission;
import java.security.PermissionCollection;
/**
 * 
 * Java FilePermission Example.
 * 
 *  the simple example in which permission of a directory path is granted with read permission 
 *  and a file of this directory is granted for write permission.
 * **/
public class InputOutput7 {

	public static void main(String[] args) {
		String src = "C:\\Users\\Prashant\\Desktop\\My txt\\Test_InoutOutput\\a.txt";

		FilePermission file1 = new FilePermission("C:\\\\Users\\\\Prashant\\\\Desktop\\\\-", "read");
		PermissionCollection permission = file1.newPermissionCollection();
		permission.add(file1);

		FilePermission file2 = new FilePermission(src, "write");
		permission.add(file2);

		if (permission.implies(new FilePermission(src, "read, write"))) {
			System.out.println("Read, Write permission is granted for the path " + src);
		} else {
			System.out.println("No Read, Write permission is granted for the path " + src);
		}
	}

}
