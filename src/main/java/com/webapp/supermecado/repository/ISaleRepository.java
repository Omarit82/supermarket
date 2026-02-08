package com.webapp.supermecado.repository;

import com.webapp.supermecado.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISaleRepository extends JpaRepository<Sale,Long> {
}
