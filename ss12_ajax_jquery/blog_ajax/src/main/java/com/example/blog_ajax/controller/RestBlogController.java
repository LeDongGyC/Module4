package com.example.blog_ajax.controller;

import com.example.blog_ajax.model.Blog;
import com.example.blog_ajax.service.IBlogService;
import com.example.blog_ajax.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/blog")
public class RestBlogController {
    @Autowired
    IBlogService blogService;
    @Autowired
    ICategoryService categoryService;
    private int number = 2;

    @GetMapping("")
    public ResponseEntity<List<Blog>> getAll() {
        List<Blog> blogList = blogService.findAll();
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    @GetMapping("/page")
    public ResponseEntity<Page<Blog>> getAllPage(@RequestParam(defaultValue = "0") Optional<Integer> page) {
        int page1 = 0;
        if ((page.isPresent()))
            page1 = page.get();
        Pageable pageable = PageRequest.of(page1, 2);
        Page<Blog> pages = blogService.findAllPage(pageable);
        if (pages.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(pages, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody Blog blog) {
        blogService.save(blog);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PatchMapping("/edit")
    public ResponseEntity<?> edit(@RequestBody Blog blog) {
        Blog blog1 = blogService.findById(blog.getId());
        if (blog1 == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        blogService.save(blog);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> findById(@PathVariable Integer id) {
        Blog blog = blogService.findById(id);
        if (blog == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/search/{name}")
    public ResponseEntity<List<Blog>> searchBlog(@PathVariable String name) {
        List<Blog> blogList = blogService.searchName(name);
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<List<Blog>> findBlogsByCategoryID(@PathVariable String id) {
        List<Blog> blogs = blogService.findByCategory(id);
        if (blogs.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @GetMapping("/quantity")
    public ResponseEntity<List<Blog>> showPage() {
        number += 2;
        List<Blog> blogList = blogService.getListLimit(number);
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }
}
