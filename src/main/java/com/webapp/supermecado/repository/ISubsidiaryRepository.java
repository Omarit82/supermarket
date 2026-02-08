package com.webapp.supermecado.repository;

import com.webapp.supermecado.model.Subsidiary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubsidiaryRepository extends JpaRepository<Subsidiary,Long> {
}
