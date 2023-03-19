package com.example.phone_management_app.service;

import com.example.phone_management_app.model.Smartphone;
import com.example.phone_management_app.repository.ISmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartphoneService implements ISmartphoneService {
    @Autowired
    ISmartphoneRepository repository;

    @Override
    public List<Smartphone> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Smartphone smartphone) {
        repository.save(smartphone);
    }

    @Override
    public Smartphone findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void removeById(int id) {
        repository.deleteById(id);
    }
}
