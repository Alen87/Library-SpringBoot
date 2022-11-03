package com.application.library.entity;

import javax.persistence.*;

@Entity
@Table(name="authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name",length = 100,nullable = false,unique = true)
    private String name;

    @Column(name="description",length = 250,nullable = false)
    private String description;


}
