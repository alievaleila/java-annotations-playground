package com.example;

import com.example.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AnnotationApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(AnnotationApplication.class, args);
		Book book=context.getBean(Book.class);
		book.setTitle("Tell me your dreams.");
		System.out.println("The title of the book is: "+ book.getTitle());
	}

}
