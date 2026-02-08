package com.webapp.supermecado.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter@Setter@Entity@Table(name="sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_sale;
    @ManyToMany @JoinTable(name="sale_products",
            joinColumns = @JoinColumn(name="id_sale"),
            inverseJoinColumns = @JoinColumn(name="id_product")
    )
    private List<Product> products = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "subsidiary_id")
    private Subsidiary subsidiary;

    public Sale(){

    }
    public Sale(Long id_sale){
        this.id_sale = id_sale;
    }

    private String list(){
        StringBuilder response = new StringBuilder();
        for (Product product : products) {
            response.append("Product: ").append(product.getName()).append(" id: ").append(product.getId_product()).append("\n");
        }
        return response.toString();
    }
    @Override
    public String toString(){
        return "Sale id: "+id_sale+"\n"+list();
    }
}
