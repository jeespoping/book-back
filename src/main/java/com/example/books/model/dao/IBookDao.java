package com.example.books.model.dao;

import com.example.books.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookDao extends JpaRepository<Book, Long> {

}
