package com.webapp.supermecado.Service;

import com.webapp.supermecado.model.Product;

import java.util.List;

public interface IProductService {
    Product getProduct(Long id);
    List<Product> getAllProducts();
    Product postProduct(Product product);
    void deleteProduct(Long id);
    Product putProduct(Product product);
}
