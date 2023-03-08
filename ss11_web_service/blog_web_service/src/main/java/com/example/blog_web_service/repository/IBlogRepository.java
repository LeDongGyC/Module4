package com.example.blog_web_service.repository;

import com.example.blog_web_service.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog,Integer> {
}
