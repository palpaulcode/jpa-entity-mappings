package com.springdata.jpaentitymappings.entity;

import javax.persistence.*;

@Entity
@Table
public class Item {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    /*@OneToOne(cascade = CascadeType.ALL, mappedBy = "item")
    private Customer customer;*/

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }
}
