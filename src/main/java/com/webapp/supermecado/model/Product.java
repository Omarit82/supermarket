package com.webapp.supermecado.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_product;
    private String name;
    private int stock;
    private double price;
    private String description;
    @ManyToMany(mappedBy = "products")
    private List<Sale> sales = new ArrayList<>();

    public Product() {
    }

    public Product(Long id_product, String name, int stock, double price, String description) {
        this.id_product = id_product;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.description = description;
    }
    @Override
    public String toString(){
        return "id: "+id_product+"\nName: "+name+"\nDescription: "+description;
    }
}
