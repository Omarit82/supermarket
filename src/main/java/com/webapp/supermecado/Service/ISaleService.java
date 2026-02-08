package com.webapp.supermecado.Service;

import com.webapp.supermecado.model.Sale;

import java.util.List;

public interface ISaleService {
    public Sale getSale(Long id);
    public List<Sale> getSales();
    public Sale postSale(Sale sale);
    public void deleteSale(Long id);
    public Sale putSale(Sale sale);
}
