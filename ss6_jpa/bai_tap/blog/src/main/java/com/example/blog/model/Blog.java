package com.example.blog.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Blog {
    @Id
    private int id;
    private String nameBlog;
    private String author;
    private String content;
    private String summary;

    public Blog() {
    }

    public Blog(int id, String nameBlog, String author, String content, String summary) {
        this.id = id;
        this.nameBlog = nameBlog;
        this.author = author;
        this.content = content;
        this.summary = summary;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
