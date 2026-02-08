package com.webapp.supermecado.controller;

import com.webapp.supermecado.Service.IProductService;
import com.webapp.supermecado.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private IProductService service;
    @GetMapping("api/products/{id}")
    public ResponseEntity<String> getProduct(@PathVariable Long id){
        Product pp = service.getProduct(id);
        if(pp==null){
            return ResponseEntity.status(404).body("Product not found");
        }
        return ResponseEntity.status(200).body("Product:"+pp);
    }
    @GetMapping("api/products")
    public ResponseEntity<String> getProducts(){
        List<Product> products = service.getAllProducts();
        if(products.isEmpty()){
            return ResponseEntity.status(400).body("Not found");
        }
        return ResponseEntity.status(200).body("Products: "+products);
    }
    @PostMapping("api/products")
    public ResponseEntity<String> postProduct(@RequestBody Product product){
        Product pp = service.postProduct(product);
        return ResponseEntity.status(201).body("Product created id: "+pp.getId_product());
    }
    @DeleteMapping("api/products/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id){
        service.deleteProduct(id);
        return ResponseEntity.status(200).body("Product erased");
    }
    @PutMapping("api/products")
    public  ResponseEntity<String> putProduct(@RequestBody Product product){
        Product pp = service.putProduct(product);
        return ResponseEntity.status(200).body("Product modified successfully: "+pp);
    }
}
