package com.pawandockering.dockertest.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

class Book{
	int id;
	String name;
	
	public Book() {}
	
	public Book(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

@RestController
public class MainController {
	
	@GetMapping("/books")		//same as RequestMapping(value="/books",method=RequestMethod.GET) , it will handle only GET request
	public ResponseEntity<Book> getBooks() {			//ResponseEntity is used to send status alongwith object of type List<Book> here
		Book book=new Book(25,"Docker Book");
		return ResponseEntity.of(Optional.of(book));	//springboot automatically converts List<Book> object to JSON format
	}
}
	