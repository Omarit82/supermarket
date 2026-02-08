package com.webapp.supermecado.Service;

import com.webapp.supermecado.model.Product;

import java.util.List;

public interface IProductService {
    public Product getProduct(Long id);
    public List<Product> getAllProducts();
    public Product postProduct(Product product);
    public void deleteProduct(Long id);
    public Product putProduct(Product product);
}
