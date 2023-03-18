package com.example.blog_ajax.service;

import com.example.blog_ajax.model.Blog;
import com.example.blog_ajax.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public List<Blog> findByCategory(String cateId) {
        return repository.searchCategory(cateId);
    }

    @Override
    public List<Blog> searchName(String name) {
        return repository.searchName(name);
    }

    @Override
    public List<Blog> getListLimit(int number) {
        return repository.getListLimit(number);
    }

    @Override
    public Page<Blog> findAllPage(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
