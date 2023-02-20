package com.example.blog.repository;

import com.example.blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
    @Query(value = "select * from Category where name like : name", nativeQuery = true)
    Page<Category> search(@Param("name") String name, Pageable pageable);
}
