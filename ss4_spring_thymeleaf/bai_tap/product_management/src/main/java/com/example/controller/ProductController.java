package com.example.controller;

import com.example.bean.Product;
import com.example.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/list")
    public String home(Model model) {
        model.addAttribute("productList", productService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        productService.save(product);
        redirectAttributes.addFlashAttribute("mess", "Them moi thanh cong");
        return "redirect:/product/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(Model model, @PathVariable int id) {
        model.addAttribute("product", productService.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Product product) {
        productService.update(product.getId(), product);
        return "redirect:/product/list";
    }

    @GetMapping("/delete/{id}")
    public String showDeleteForm(Model model, @PathVariable int id) {
        model.addAttribute("product", productService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Product product) {
        productService.remove(product.getId());
        return "redirect:/product/list";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable int id) {
        model.addAttribute("product", productService.findById(id));
        return "detail";
    }

    @PostMapping("/search")
    public String search(Model model, @RequestParam String name) {
        model.addAttribute("productList", productService.search(name));
        return "list";
    }
}
