package com.example.blog_ajax.service;

import com.example.blog_ajax.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
    Blog findById(int id);
    void save(Blog blog);
    List<Blog> findByCategory(String cateId);
    List<Blog> searchName(String name);
    List<Blog> getListLimit(int number);
    Page<Blog> findAllPage(Pageable pageable);
}
