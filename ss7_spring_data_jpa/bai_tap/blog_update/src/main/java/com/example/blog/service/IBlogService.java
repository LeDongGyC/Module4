package com.example.blog.service;

import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    Page<Blog> search(String nameBlog, Pageable pageable);
    Blog findById(int id);

    void save(Blog blog);

    void update(Blog blog);

    void delete(Blog blog);
}
