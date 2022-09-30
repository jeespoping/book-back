package com.example.books.model.services;

import com.example.books.model.entity.Book;

import java.util.List;

public interface IBookService {
    public List<Book> findAll();

    public Book findById(Long id);
}
