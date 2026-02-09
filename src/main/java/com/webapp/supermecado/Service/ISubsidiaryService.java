package com.webapp.supermecado.Service;

import com.webapp.supermecado.model.Subsidiary;

import java.util.List;

public interface ISubsidiaryService {
    Subsidiary getSubsidiary(Long id);
    List<Subsidiary> getSubsidiaries();
    Subsidiary postSubsidiary(Subsidiary sub);
    void deleteSubsidiary(Long id);
    Subsidiary putSubsidiary(Subsidiary sub);
}
