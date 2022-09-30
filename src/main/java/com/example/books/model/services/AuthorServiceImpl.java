package com.example.books.model.services;

import com.example.books.model.dao.IAuthorDao;
import com.example.books.model.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthorServiceImpl implements IAuthorService  {

    @Autowired
    private IAuthorDao authorDao;

    @Override
    @Transactional(readOnly = true)
    public List<Author> findAll() {
        return (List<Author>) authorDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Author findById(Long id) {
        return authorDao.findById(id).orElse(null);
    }
}
