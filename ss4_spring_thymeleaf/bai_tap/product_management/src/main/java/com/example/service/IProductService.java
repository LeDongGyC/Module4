package com.example.service;

import com.example.bean.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product findById(int id);

    void save(Product product);

    void update(int id, Product product);

    void remove(int id);

    List<Product> search(String nameSearch);
}
