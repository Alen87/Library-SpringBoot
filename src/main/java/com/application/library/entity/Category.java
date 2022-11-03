package com.application.library.entity;

import javax.persistence.*;

@Entity
@Table(name="categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

    @Column(name="name",length = 50,nullable = false,unique = true)
   private String name;


}
