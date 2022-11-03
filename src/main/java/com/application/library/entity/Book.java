package com.application.library.entity;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="isbn",length = 50,nullable = false,unique = true)
    private String isbn;

    @Column(name="name",length = 50,nullable = false)
    private String name;


    @Column(name="description",length = 50,nullable = false)
    private String description;


}
