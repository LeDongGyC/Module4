package com.example.blog_web_service.dto;

import com.example.blog_web_service.model.Category;

public class BlogDto {
    private int id;
    private String nameBlog;
    private String author;
    private String dateUpdate;
    private String content;
    private String description;
    private Category category;

    public BlogDto() {
    }

    public BlogDto(int id, String nameBlog, String author, String dateUpdate, String content, String description, Category category) {
        this.id = id;
        this.nameBlog = nameBlog;
        this.author = author;
        this.dateUpdate = dateUpdate;
        this.content = content;
        this.description = description;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(String dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
