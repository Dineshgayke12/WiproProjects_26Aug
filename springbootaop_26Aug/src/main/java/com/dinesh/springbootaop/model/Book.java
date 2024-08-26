package com.dinesh.springbootaop.model;

public class Book {

	private String bookId;
	private String title;
	
	
	public Book() {
		
	}
	
	public Book(String bookId, String title) {
		super();
		this.bookId = bookId;
		this.title = title;
	}
	
	
	public String getBookId() {
		return bookId;
	}
	
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	
	
	
}
