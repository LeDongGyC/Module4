package com.example.blog_web_service.service;

import com.example.blog_web_service.model.Category;
import com.example.blog_web_service.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepository repository;

    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }

    @Override
    public Category findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void save(Category category) {
        repository.save(category);
    }

    @Override
    public void update(Category category) {
        repository.save(category);
    }

    @Override
    public void remove(Category category) {
        repository.delete(category);
    }
}
