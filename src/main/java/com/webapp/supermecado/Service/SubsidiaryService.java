package com.webapp.supermecado.Service;

import com.webapp.supermecado.model.Subsidiary;
import com.webapp.supermecado.repository.ISubsidiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubsidiaryService implements ISubsidiaryService{
    @Autowired
    private ISubsidiaryRepository repository;
    @Override
    public Subsidiary getSubsidiary(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Subsidiary> getSubsidiaries() {
        return repository.findAll();
    }

    @Override
    public Subsidiary postSubsidiary(Subsidiary sub) {
        return repository.save(sub);
    }

    @Override
    public void deleteSubsidiary(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Subsidiary putSubsidiary(Subsidiary sub) {
        return repository.save(sub);
    }

}
