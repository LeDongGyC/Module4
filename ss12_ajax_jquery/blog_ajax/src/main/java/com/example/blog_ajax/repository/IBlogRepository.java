package com.example.blog_ajax.repository;

import com.example.blog_ajax.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @Query(value = "select * from blog where name_blog like %:name_blog%", nativeQuery = true)
    List<Blog> searchName(@Param("name_blog") String name);

    @Query(value = "select * from blog where category_id like %:category_id%", nativeQuery = true)
    List<Blog> searchCategory(@Param("category_id") String id);

    @Query(value = "select * from blog where name_blog like %:name_blog% and category_id like %:category_id%", nativeQuery = true)
    List<Blog> searchNameCategory(@Param("name_blog") String name,@Param("category_id") String id);

    @Query(value = "select * from blog limit : number",nativeQuery = true)
    List<Blog> getListLimit(int number);
}
