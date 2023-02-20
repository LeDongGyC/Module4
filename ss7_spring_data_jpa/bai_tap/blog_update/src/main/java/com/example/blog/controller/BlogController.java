package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.IBlogService;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    IBlogService blogService;

    @Autowired
    ICategoryService categoryService;

    @GetMapping("/list")
    public String home(Model model) {
        model.addAttribute("blogList", blogService.findAll());
        return "blog/list";
    }

//    @GetMapping("/page")
//    public String home(Model model, @RequestParam(required = false, defaultValue = "") String searchName, @PageableDefault(size = 2, page = 0, sort = "date_update", direction = Sort.Direction.DESC) Pageable pageable) {
//        Page<Blog> pages = blogService.search(searchName,pageable);
//        model.addAttribute("searchName",searchName);
//        model.addAttribute("pages",pages);
//        return "page";
//    }

    @GetMapping("/page")
    public String home(Model model, @RequestParam(required = false, defaultValue = "") String searchName, @RequestParam(defaultValue = "0") int page) {
        Pageable pageable = PageRequest.of(page,2,Sort.by("date_update").descending());
        Page<Blog> pages = blogService.search(searchName, pageable);
        model.addAttribute("searchName", searchName);
        model.addAttribute("pages", pages);
        return "blog/page";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("cateList",categoryService.findAll());
        return "blog/create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Blog blog) {
        blogService.save(blog);
        return "redirect:/blog/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(Model model, @PathVariable int id) {
        model.addAttribute("blog", blogService.findById(id));
        model.addAttribute("cateList",categoryService.findAll());
        return "blog/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Blog blog) {
        blogService.update(blog);
        return "redirect:/blog/list";
    }

//    @GetMapping("/delete/{id}")
//    public String showDeleteForm(Model model, @PathVariable int id) {
//        model.addAttribute("blog", blogService.findById(id));
//        return "delete";
//    }

    @GetMapping("/delete/{id}")
    public String showDeleteForm(Model model, @PathVariable int id) {
//        model.addAttribute("blog", blogService.findById(id));
        blogService.delete(blogService.findById(id));
        return "redirect:/blog/list";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Blog blog) {
        blogService.delete(blog);
        return "redirect:/blog/list";
    }
}
