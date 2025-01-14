package com.dinesh.springbootaop.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.springbootaop.model.Book;
import com.dinesh.springbootaop.service.BookService;

@RestController

public class BookController {
	
	@Autowired
	private BookService bookService;

	@RequestMapping(value="/add/book" , method = RequestMethod.POST )
	public Book addBook(@RequestParam("title") String title,@RequestParam("bookId")String bookId ) {
		
		return bookService.addBook(title, bookId);
	}
	
	@RequestMapping(value="/remove/book", method= RequestMethod.GET)
	public String removeBook(@RequestParam("bookId")String bookId) {
		
		bookService.deleteBook(bookId);
		return"Book removed :" + bookId;
	}
	
	
	@RequestMapping(value="/read/book", method = RequestMethod.GET)
	public void readBook(@RequestParam("title") String title, @RequestParam("bookId") String bookId) {
		bookService.newBook(title, bookId);
	}
	
}
