package com.example.blog.controller;

import com.example.blog.model.Category;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService service;
    @GetMapping("/list")
    public String home(Model model){
        model.addAttribute("cateList", service.findAll());
        return "category/list";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("category", new Category());
        return "category/create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Category category) {
        service.save(category);
        return "redirect:/category/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(Model model, @PathVariable int id) {
        model.addAttribute("category",service.findById(id));
        return "category/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Category category) {
        service.update(category);
        return "redirect:/category/list";
    }


    @GetMapping("/delete/{id}")
    public String showDeleteForm(Model model, @PathVariable int id) {
        service.delete(service.findById(id));
        return "redirect:/category/list";
    }

}
