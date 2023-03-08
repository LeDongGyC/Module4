package com.example.blog_web_service.repository;

import com.example.blog_web_service.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {
}
