package com.webapp.supermecado.Service;

import com.webapp.supermecado.model.Product;
import com.webapp.supermecado.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepository repository;

    @Override
    public Product getProduct(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public Product postProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Product putProduct(Product product) {
        return repository.save(product);
    }
}
