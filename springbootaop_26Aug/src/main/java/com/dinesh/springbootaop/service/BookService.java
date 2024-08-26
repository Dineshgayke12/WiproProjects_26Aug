package com.dinesh.springbootaop.service;

import org.springframework.stereotype.Service;

import com.dinesh.springbootaop.model.Book;

@Service
public class BookService {

	
	public Book addBook(String title, String bookId) {
		
		Book book = new Book(bookId, title);
		
		System.out.println("insoide book");
		System.out.println("Creating a book" + title + "" + bookId);
		
		
		
		return book;
		
	}
	
	public void deleteBook(String bookId) {
		
		System.out.println("Deleteing book with id:" + bookId);;
	}
	
public void newBook(String title,String bookId) {
		
	    System.out.println("insoide book");
	    System.out.println("Have you  read the new a book with title" + title + "id :" + bookId);
	}
	
}
