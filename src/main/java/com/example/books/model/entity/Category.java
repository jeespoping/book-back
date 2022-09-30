package com.example.books.model.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "LIB_BOOK_CATEGORIES")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CAT_ID")
    private Long id;

    @Column(name = "CAT_DESCRIPCIÓN", length = 60)
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private static final long serialVersionUID = 1L;
}
