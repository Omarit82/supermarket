package com.webapp.supermecado.Service;

import com.webapp.supermecado.model.Subsidiary;

import java.util.List;

public interface ISubsidiaryService {
    public Subsidiary getSubsidiary(Long id);
    public List<Subsidiary> getSubsidiaries();
    public Subsidiary postSubsidiary(Subsidiary sub);
    public void deleteSubsidiary(Long id);
    public Subsidiary putSubsidiary(Subsidiary sub);
}
