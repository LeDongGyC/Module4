package com.example.blog_ajax.repository;

import com.example.blog_ajax.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
    List<Category> findByNameContaining(String name);
}
