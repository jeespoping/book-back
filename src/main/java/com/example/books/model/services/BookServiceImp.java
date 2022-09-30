package com.example.books.model.services;

import com.example.books.model.dao.IBookDao;
import com.example.books.model.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class BookServiceImp  implements IBookService{

    @Autowired
    private IBookDao bookDao;


    @Override
    @Transactional(readOnly = true)
    public List<Book> findAll() {
        return (List<Book>) bookDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Book findById(Long id) {
        return bookDao.findById(id).orElse(null);
    }
}
