package com.example.books.model.dao;

import com.example.books.model.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface IAuthorDao extends CrudRepository<Author, Long> {
}
