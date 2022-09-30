package com.example.books.model.dao;

import com.example.books.model.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryDao extends CrudRepository<Category, Long> {

}
