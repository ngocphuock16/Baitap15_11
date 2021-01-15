package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int count;
    private int price;
    @ManyToOne
    @JoinColumn(name = "idOrder")
    private Order Order;
    public Order() {
    }

    public Order(Long id, String name, int count, int price, com.codegym.model.Order order) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.price = price;
        Order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public com.codegym.model.Order getOrder() {
        return Order;
    }

    public void setOrder(com.codegym.model.Order order) {
        Order = order;
    }


}
