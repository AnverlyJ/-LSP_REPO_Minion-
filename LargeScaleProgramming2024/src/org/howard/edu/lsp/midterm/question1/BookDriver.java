package org.howard.edu.lsp.midterm.question1;

public class BookDriver {

	    public static void main(String[] args) {
	        // Create instances of the Book class
	        book book1 = new book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
	        book book2 = new book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
	        book book3 = new book("A Promised Land", "Barack Obama", "9780593239681", 2020);

	        // Check if book1 and book2 are equal (should return true)
	        System.out.println(book1.equals(book2)); // true

	        // Check if book1 and book3 are equal (should return false)
	        System.out.println(book1.equals(book3)); // false

	        // Print the string representation of book1
	        System.out.println(book1); // Output: Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 123456789, Year Published: 1925
	    }
	}


