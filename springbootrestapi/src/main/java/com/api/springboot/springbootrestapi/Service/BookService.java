package com.api.springboot.springbootrestapi.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.springboot.springbootrestapi.Entities.Book;
@Component
public class BookService {
    private static List<Book> list = new ArrayList<>();

static{
    list.add(new Book(123,"JAVA","XYZ"));
    list.add(new Book(1234,"Python", "ABC"));
    list.add(new Book(123456,"New Book Python","XYZABC"));


}

//get all book

public List<Book> getAllBooks()
{
    return list;
}


//get book by id
public Book getBookbyId(int id)
{
    Book book = null;
    book= list.stream().filter(e->e.getId()==id).findFirst().get();
    return book;

}
 public Book addBook(Book b){
    list.add(b);
    return b;
    

 }


}
