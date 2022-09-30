package com.example.books.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "LIB_AUTHORS")
public class Author implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AUT_ID")
    private Long id;

    @Column(name = "AUT_FIRST_NAME", length = 30)
    private String firstName;

    @Column(name = "AUT_LAST_NAME", length = 30)
    private String lastName;

    @Column(name = "AUT_DATE_DOB")
    @Temporal(TemporalType.DATE)
    private Date dateDob;

    @Column(name = "AUT_GENDER", length = 1)
    private String gender;

    @Column(name = "AUT_CONTACT", length = 30)
    private String contact;

    @Column(name = "AUT_OTHER_DETAILS", length = 200)
    private String details;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateDob() {
        return dateDob;
    }

    public void setDateDob(Date dateDob) {
        this.dateDob = dateDob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    private static final long serialVersionUID = 1L;
}
