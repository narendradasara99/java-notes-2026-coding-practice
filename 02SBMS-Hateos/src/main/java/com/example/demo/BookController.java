package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@GetMapping("getbook/{name}")
	public Book getInfo(@PathVariable("name") String s) {
		Book book = new Book(s, 900.0);

		Link withRel = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).getAllBooks())
				.withRel("All-Books");
		book.add(withRel);
		return book;

	}

	@GetMapping("/getBooks")
	public ResponseEntity<List<Book>> getAllBooks() {

		Book book = new Book("java", 600.0);
		Book book2 = new Book("python", 300.9);

		ArrayList<Book> l = new ArrayList<>();
		l.add(book2);
		l.add(book);

		return new ResponseEntity<List<Book>>(l, HttpStatus.OK);
	}
	
	
}
