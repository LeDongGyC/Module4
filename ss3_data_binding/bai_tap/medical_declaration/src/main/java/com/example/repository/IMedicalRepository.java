package com.example.repository;

import com.example.bean.Medical;

import java.util.List;

public interface IMedicalRepository {
    List<Medical> findAll();
    void save(Medical medical);
}
