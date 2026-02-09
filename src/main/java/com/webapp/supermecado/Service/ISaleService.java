package com.webapp.supermecado.Service;

import com.webapp.supermecado.model.Sale;

import java.util.List;

public interface ISaleService {
    Sale getSale(Long id);
    List<Sale> getSales();
    Sale postSale(Sale sale);
    void deleteSale(Long id);
    Sale putSale(Sale sale);
}
