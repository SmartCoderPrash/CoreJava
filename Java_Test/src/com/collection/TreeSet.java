package com.collection;

import java.util.Iterator;
import java.util.Set;

class Book implements Comparable<Book> {

	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Book b) {
		if (id > b.id) {
			return 1;
		} else if (id < b.id) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class TreeSet {

	public static void main(String[] args) {
		Set<Book> books = new java.util.TreeSet<Book>();
		Book book1 = new Book(0, "prash", "xyz", "sss", 10);
		Book book2 = new Book(1, "anand", "xyz", "sss", 11);
		Book book3 = new Book(2, "Rushi", "xyz", "sss", 12);
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		Iterator<Book> itr = books.iterator();
		
		
		
		for (Book br : books) {
			System.out.println(br.id+" =>> "+br.name);
		}
	}

}
