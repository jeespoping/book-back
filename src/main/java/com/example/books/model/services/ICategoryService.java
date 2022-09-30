package com.example.books.model.services;

import com.example.books.model.entity.Author;
import com.example.books.model.entity.Category;

import java.util.List;

public interface ICategoryService {
    public List<Category> findAll();

    public Category findById(Long id);
}
