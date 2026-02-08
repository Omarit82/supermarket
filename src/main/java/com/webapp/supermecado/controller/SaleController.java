package com.webapp.supermecado.controller;

import com.webapp.supermecado.Service.ISaleService;
import com.webapp.supermecado.model.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaleController {

    @Autowired
    private ISaleService service;

    @GetMapping("api/sales/{id}")
    public ResponseEntity<String> getSale(@PathVariable Long id){
        return ResponseEntity.status(200).body("Sale: "+service.getSale(id));
    }
    @GetMapping("api/sales")
    public ResponseEntity<String> getSales(){
        return ResponseEntity.status(200).body("Sales: "+service.getSales());
    }
    @PostMapping("api/sales")
    public ResponseEntity<String> postSales(@RequestBody Sale sale){
        Sale ss = service.postSale(sale);
        return ResponseEntity.status(201).body("Sale created ");
    }
    @PutMapping("api/sales")
    public ResponseEntity<String> putSales(@RequestBody Sale sale){
        Sale ss = service.putSale(sale);
        return  ResponseEntity.status(200).body("Sale modified "+ss.getId_sale());
    }
    @DeleteMapping("api/sales/{id}")
    public ResponseEntity<String> deleteSale(@PathVariable Long id){
        service.deleteSale(id);
        return ResponseEntity.status(200).body("Sale deleted "+id);
    }
}
