package com.collection;

class a{
	public int a = 10;
	public void test() {
		System.out.println("this is test of parent..");
	}
}
class b extends a{
	public int a = 20;
	public void test() {
		System.out.println("this is test of Child..");}
}
public class PriorityQueue {

	public static void main(String[] args) {
	String str1 = "abc";
	String str2 = "abc";
	
	if (str1 == str2) 
		System.out.println("equal");
	else
		System.out.println("unequal");
	
	a aa =  new b();
	System.out.println(aa.a);
	aa.test();
	
	b bb = new b();
	bb.test();
	
	
		
	}

}
