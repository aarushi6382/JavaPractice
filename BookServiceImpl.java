package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.model.Book;

public class BookServiceImpl implements BookService {


	@Override
	public void addBook(Book b) {
		// TODO Auto-generated method stub
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","1234");
			
		
			String sql = "insert into book(name,publication,author,price)values('"+b.getName()+"','"+b.getPublication()+"','"+b.getAuthor()+"','"+b.getPrice()+"')";
			
			  Statement  stm  = con.createStatement();
				//c. execute sql
				  stm.execute(sql);
				//d. close db
				  con.close();
				  
		
			System.out.println("added success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	
@Override
public void deleteBook(int index) {
	
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","1234");
		
	
		String sql = "delete from book where id = 2";
		Statement stm = con.createStatement();
		stm.execute(sql);
		con.close();
		System.out.println(" deletion success");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}

@Override
public List<Book> getAllBook() {
try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","1234");
		
		String sql = "select * from book";
		Statement stm = con.createStatement();
		ResultSet  rows = stm.executeQuery(sql);
		
		while(rows.next()) {
			System.out.println("Id = "+rows.getInt("id"));
			System.out.println("Name = "+rows.getString("name"));
			System.out.println("Publication = "+rows.getString("publication"));
			System.out.println("Author = "+rows.getString("author"));
			System.out.println("Price = "+rows.getString("price"));
		System.out.println("------------");
	}
		
		con.close();
		
} catch (Exception e) {
	e.printStackTrace();
}

	return null;
}

@Override
public void updateBook(int index) {
try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","1234");
		
	String sql = "update book set  price = '1100' where id = 1  ";
	Statement stm = con.createStatement();
	stm.execute(sql);
	
	con.close();
	System.out.println("success");
	
} catch (Exception e) {
e.printStackTrace();
}

	
}
}


