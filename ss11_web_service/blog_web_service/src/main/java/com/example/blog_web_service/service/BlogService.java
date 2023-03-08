package com.example.blog_web_service.service;

import com.example.blog_web_service.model.Blog;
import com.example.blog_web_service.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogRepository repository;

    @Override
    public List<Blog> findAll() {
        return repository.findAll();
    }

    @Override
    public Blog findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        repository.save(blog);
    }

    @Override
    public void update(Blog blog) {
        repository.save(blog);
    }

    @Override
    public void remove(Blog blog) {
        repository.delete(blog);
    }
}
