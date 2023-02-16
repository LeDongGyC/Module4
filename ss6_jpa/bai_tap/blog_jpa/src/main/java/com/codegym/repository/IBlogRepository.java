package com.codegym.repository;

import com.codegym.model.Blog;

import java.util.List;

public interface IBlogRepository {
    List<Blog> findAll();
    void save(Blog blog);
    void update(int id,Blog blog);
    void remove(Blog blog);
    Blog findById(int id);
}
