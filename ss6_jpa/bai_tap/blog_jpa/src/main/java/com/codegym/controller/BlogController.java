package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    IBlogService blogService;

    @GetMapping("/list")
    public String home(Model model) {
        model.addAttribute("blogList", blogService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Blog blog) {
        blogService.save(blog);
        return "redirect:/blog/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(Model model, @PathVariable int id) {
        model.addAttribute("blog", blogService.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Blog blog) {
        blogService.update(blog.getId(), blog);
        return "redirect:/blog/list";
    }

    @GetMapping("/delete/{id}")
    public String showDeleteForm(Model model, @PathVariable int id) {
        model.addAttribute("blog", blogService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Blog blog) {
        blogService.remove(blog);
        return "redirect:/blog/list";
    }
}
