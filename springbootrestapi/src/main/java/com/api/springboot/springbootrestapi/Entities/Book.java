package com.api.springboot.springbootrestapi.Entities;

public class Book {
    private int id;
    private String name;
    private String author;
    
    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Book() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "books [id=" + id + ", name=" + name + ", author=" + author + "]";
    }
    

}


