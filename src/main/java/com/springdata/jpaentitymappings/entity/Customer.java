package com.springdata.jpaentitymappings.entity;

import javax.persistence.*;

@Entity
@Table
public class Customer {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name ="fk_item")

    // with join table comment out relation from other entity
    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "customer_item",
            joinColumns = {@JoinColumn(name = "customer_id")},
            inverseJoinColumns = {@JoinColumn(name = "item_id")})
    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
