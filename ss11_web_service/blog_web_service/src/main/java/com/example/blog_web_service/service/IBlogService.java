package com.example.blog_web_service.service;

import com.example.blog_web_service.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
    Blog findById(int id);
    void save(Blog blog);
    void update(Blog blog);
    void remove(Blog blog);
}
