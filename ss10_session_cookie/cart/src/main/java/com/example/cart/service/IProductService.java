package com.example.cart.service;

import com.example.cart.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(int id);
    void save(Product product);
    void update(Product product);
    void remove(Product product);
}
