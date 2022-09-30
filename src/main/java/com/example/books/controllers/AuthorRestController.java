package com.example.books.controllers;

import com.example.books.model.entity.Author;
import com.example.books.model.services.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AuthorRestController {

    @Autowired
    private IAuthorService authorService;

    @GetMapping("/authors")
    public List<Author> index() {
        return authorService.findAll();
    }
}
