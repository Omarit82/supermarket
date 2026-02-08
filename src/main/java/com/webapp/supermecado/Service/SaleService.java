package com.webapp.supermecado.Service;

import com.webapp.supermecado.model.Sale;
import com.webapp.supermecado.repository.ISaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService implements ISaleService{
    @Autowired
    private ISaleRepository repository;

    @Override
    public Sale getSale(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Sale> getSales() {
        return repository.findAll();
    }

    @Override
    public Sale postSale(Sale sale) {
        return repository.save(sale);
    }

    @Override
    public void deleteSale(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Sale putSale(Sale sale) {
        return repository.save(sale);
    }
}
