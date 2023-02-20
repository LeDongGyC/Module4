package com.example.blog.service;

import com.example.blog.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    Category findById(int id);

    void save(Category category);

    void update(Category category);

    void delete(Category category);
}
