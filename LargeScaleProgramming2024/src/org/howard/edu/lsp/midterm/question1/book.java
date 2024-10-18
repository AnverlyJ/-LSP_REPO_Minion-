package org.howard.edu.lsp.midterm.question1;

public class book {
	
	    // private for encapsulation
	    private String title;
	    private String author;
	    private String ISBN;
	    private int yearPublished;

	    //  initialize the book object
	    public book(String title, String author, String ISBN, int yearPublished) {
	        this.title = title;
	        this.author = author;
	        this.ISBN = ISBN;
	        this.yearPublished = yearPublished;
	    }

	    // getters and setters 
	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public String getISBN() {
	        return ISBN;
	    }

	    public void setISBN(String ISBN) {
	        this.ISBN = ISBN;
	    }

	    public int getYearPublished() {
	        return yearPublished;
	    }

	    public void setYearPublished(int yearPublished) {
	        this.yearPublished = yearPublished;
	    }

	    // 2. Override equals() to compare based on ISBN and author
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true; // Same object reference
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false; // Null or different class type
	        }
	        book book = (book) obj;
	        return this.ISBN.equals(book.ISBN) && this.author.equals(book.author);
	    }

	    // 3. Override toString() to return a meaningful string representation
	    @Override
	    public String toString() {
	        return "Title: " + title + ", Author: " + author + 
	               ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
	    }
	}



