package com.example.blog_web_service.controller;

import com.example.blog_web_service.dto.BlogDto;
import com.example.blog_web_service.model.Blog;
import com.example.blog_web_service.model.Category;
import com.example.blog_web_service.service.IBlogService;
import com.example.blog_web_service.service.ICategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/blog")
public class BlogRestController {
    @Autowired
    IBlogService blogService;
    @Autowired
    ICategoryService categoryService;

    @GetMapping("/list")
    public ResponseEntity<List<Blog>> getAll() {
        List<Blog> blogList = blogService.findAll();
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    @GetMapping("/category")
    public ResponseEntity<List<Category>> getAllCategory() {
        List<Category> categoryList = categoryService.findAll();
        if (categoryList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<?> getBlog(@PathVariable int id) {
        Blog blog = blogService.findById(id);
        if (blog == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> save(@RequestBody BlogDto blogDto) {
        Blog blog = new Blog();
        BeanUtils.copyProperties(blogDto,blog);
        blogService.save(blog);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
