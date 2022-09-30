package com.example.books.model.services;


import com.example.books.model.entity.Author;

import java.util.List;

public interface IAuthorService {
    public List<Author> findAll();

    public Author findById(Long id);
}
