package com.view;


import java.util.List;
import java.util.Scanner;

import com.model.Book;

import com.service.BookService;
import com.service.BookServiceImpl;


public class BookView {
public static void main(String[] args) {
		
		//addBtn();
		//getAll();
		//deleteBtn();
		updateBtn();
	}
	
	//add book
	static void addBtn() {
		
		BookService service = new BookServiceImpl();
		char flag = 'y';
		Scanner  sc = new Scanner(System.in);
		
	  do {	
			Book b = new Book();
			
			
			System.out.println("Enter Name of Book ");
			b.setName(sc.next());
			
			System.out.println("Enter Publication Name");
			b.setPublication(sc.next());
			
			System.out.println("Enter Author Name");
			b.setAuthor(sc.next());
			
			
			System.out.println("Enter Price");
			b.setPrice(sc.nextInt());
			
			service.addBook(b);
			
			System.out.println("Do you want to add more[y/n]");
			flag = sc.next().charAt(0);
			
	  }while(flag == 'y');
		
	}
	

//get all Books
	static void getAll() {
		
		BookService service = new BookServiceImpl();
		List<Book>  blist = service.getAllBook();
				
		System.out.println(blist);
	}
	
	//delete book
	static void deleteBtn() {
		BookService  service = new BookServiceImpl();
		 service.deleteBook(0);
	}	 
		 
		 //update book
		 
		 static void updateBtn() {
			 BookService  service = new BookServiceImpl();
			 service.updateBook(0);
			 
		 
		 getAll();//get all products after deleted
	}
	
	
}
	
