package com.example.phone_management_app.service;

import com.example.phone_management_app.model.Smartphone;

import java.util.List;

public interface ISmartphoneService {
    List<Smartphone> findAll();
    void save(Smartphone smartphone);
    Smartphone findById(int id);
    void removeById(int id);
}
