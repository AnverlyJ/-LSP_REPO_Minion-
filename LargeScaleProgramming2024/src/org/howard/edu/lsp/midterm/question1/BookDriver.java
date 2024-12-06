package org.howard.edu.lsp.midterm.question1;

public class BookDriver {

	    public static void main(String[] args) {
	        // create instances of the Book class
	        book book1 = new book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
	        book book2 = new book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
	        book book3 = new book("A Promised Land", "Barack Obama", "9780593239681", 2020);

	        // check if book1 and book2 are equal 
	        System.out.println(book1.equals(book2)); // true

	        // check if book1 and book3 are equal 
	        System.out.println(book1.equals(book3)); // false

	        // print the string representation of book1
	        System.out.println(book1); 
	    }
	}


