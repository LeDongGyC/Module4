package com.example.blog_web_service.dto;

import com.example.blog_web_service.model.Blog;

import java.util.Set;

public class CategoryDto {
    private int id;
    private String name;
    Set<Blog> blogSet;

    public CategoryDto() {
    }

    public CategoryDto(int id, String name, Set<Blog> blogSet) {
        this.id = id;
        this.name = name;
        this.blogSet = blogSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Blog> getBlogSet() {
        return blogSet;
    }

    public void setBlogSet(Set<Blog> blogSet) {
        this.blogSet = blogSet;
    }
}
