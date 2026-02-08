package com.webapp.supermecado.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Subsidiary {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_subsidiary;
    private String address;
    private String name;
    @OneToMany(mappedBy = "subsidiary")
    private List<Sale> sales = new ArrayList<>();

    public Subsidiary(){

    }
    public Subsidiary(Long id_subsidiary,String name,String address){
        this.id_subsidiary = id_subsidiary;
        this.address = address;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Id: "+id_subsidiary+", Name: "+name+", Address: "+address;
    }
}
