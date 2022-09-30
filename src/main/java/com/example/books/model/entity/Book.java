package com.example.books.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "LIB_BOOKS")
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOK_ID")
    private Long id;


    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "BOOK_AUT_ID", nullable = false)
    private Author author;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "BOOK_CAT_ID", nullable = false)
    private Category cat;

    @Column(name = "BOOK_ISBN", length = 15)
    private String isbn;

    @Column(name = "BOOK_PUBLISHED_DATE")
    @Temporal(TemporalType.DATE)
    private Date published;

    @Column(name = "BOOK_TITLE", length = 100)
    private String title;

    @Column(name = "BOOK_PRICE")
    private Double price;

    @Column(name = "BOOK_DESCRIPCIÓN", length = 200)
    private String description;

    @Column(name = "BOOK_IMAGE")
    @Lob
    private Blob image;

    @Column(name = "BOOK_MIMETYPE", length = 250)
    private String typeImage;

    @Column(name = "BOOK_FILENAME", length = 400)
    private String fileName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Category getCat() {
        return cat;
    }

    public void setCat(Category cat) {
        this.cat = cat;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public void setImage(Blob image) {
        this.image = image;
    }

    public String getTypeImage() {
        return typeImage;
    }

    public void setTypeImage(String typeImage) {
        this.typeImage = typeImage;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    private static final long serialVersionUID = 1L;
}
