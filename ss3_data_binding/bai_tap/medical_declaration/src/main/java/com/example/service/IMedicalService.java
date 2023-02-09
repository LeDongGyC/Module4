package com.example.service;

import com.example.bean.Medical;

import java.util.List;

public interface IMedicalService {
    List<Medical> findAll();
    void save(Medical medical);
}
