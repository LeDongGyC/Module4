package com.codegym.repository;

import com.codegym.model.Blog;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BlogRepository implements IBlogRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Blog> findAll() {
        List<Blog> blogList = new ArrayList<>();
        TypedQuery<Blog> query = entityManager.createQuery("select b from Blog b", Blog.class);
        blogList = query.getResultList();
        entityManager.close();
        return blogList;
    }

    @Transactional
    @Override
    public void save(Blog blog) {
        entityManager.persist(blog);
    }

    @Transactional
    @Override
    public void update(int id, Blog blog) {
        Blog blogEdit = findById(blog.getId());
        blogEdit.setNameBlog(blog.getNameBlog());
        blogEdit.setAuthor(blog.getAuthor());
        blogEdit.setContent(blog.getContent());
        blogEdit.setDescription(blog.getDescription());
        entityManager.merge(blogEdit);
    }

    @Transactional
    @Override
    public void remove(Blog blog) {
        Blog blogDelete = findById(blog.getId());
        entityManager.remove(blogDelete);
    }

    @Transactional
    @Override
    public Blog findById(int id) {
        return entityManager.find(Blog.class,id);
    }
}
