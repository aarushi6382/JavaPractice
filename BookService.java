package com.service;

import java.util.List;

import com.model.Book;

public interface BookService {
	void addBook(Book b);

	void deleteBook(int index);

	List<Book> getAllBook();

	void updateBook(int index);

	


}
