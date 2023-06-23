package com.api.springboot.springbootrestapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.springboot.springbootrestapi.Entities.Book;
import com.api.springboot.springbootrestapi.Service.BookService;


@RestController
public class apicontroller {
    
    @Autowired
    private BookService bookService;

    @GetMapping("/books")

    public List<Book> getBooks(){
       return this.bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
 public Book getBook(@PathVariable("id") int id){
    return bookService.getBookbyId(id);
 }
@PostMapping("/books")
public Book addBook(@RequestBody Book book)
{
    Book b = this.bookService.addBook(book);
    return b;
    
}
   
}
