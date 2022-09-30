package com.example.books.controllers;

import com.example.books.model.entity.Book;
import com.example.books.model.services.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"http://localhost:3000/"})
@RestController
@RequestMapping("/api")
public class BookRestController {

    @Autowired
    private IBookService bookService;

    @GetMapping("/books")
    public List<Book> index() {
        return bookService.findAll();
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<?> show(@PathVariable Long id){
        Book book = null;
        Map<String, Object> response = new HashMap<>();

        try {
            book = bookService.findById(id);
        }catch (DataAccessException e){
            response.put("mensaje", "Error al realizar la consulta en la Base de datos");
            response.put("error", e.getMessage().concat(e.getMostSpecificCause().getMessage()) );
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if (book == null){
            response.put("mensaje", "El libro ID: ".concat((id.toString().concat(" No existe en la base de datos!"))));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }

        return  new ResponseEntity<Book>(book, HttpStatus.OK);
    }
}
