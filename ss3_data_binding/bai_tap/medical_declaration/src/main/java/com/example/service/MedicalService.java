package com.example.service;

import com.example.bean.Medical;
import com.example.repository.IMedicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MedicalService implements IMedicalService{
    @Autowired
    private IMedicalRepository medicalRepository;
    @Override
    public List<Medical> findAll() {
        return medicalRepository.findAll();
    }

    @Override
    public void save(Medical medical) {
        medicalRepository.save(medical);
    }
}
