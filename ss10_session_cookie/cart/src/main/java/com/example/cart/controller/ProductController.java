package com.example.cart.controller;

import com.example.cart.dto.CartDto;
import com.example.cart.dto.ProductDto;
import com.example.cart.model.Product;
import com.example.cart.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/shop")
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    ProductService service;

    @ModelAttribute("cart")
    public CartDto initCart() {
        return new CartDto();
    }

    @GetMapping("/home")
    public String showShop(Model model) {
        model.addAttribute("productList", service.findAll());
        return "/list";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable int id, Model model, HttpServletResponse response){
        Cookie cookie = new Cookie("productId",id+"");
        cookie.setMaxAge(1*24*60*60);
        cookie.setPath("/");
        response.addCookie(cookie);
        model.addAttribute("product",service.findById(id));
        return "detail";
    }
    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable int id, @SessionAttribute(value = "cart") CartDto cartDto) {
        Product product = service.findById(id);
        if (product != null) {
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(product, productDto);
            cartDto.addProduct(productDto);
        }
        return "redirect:/cart";
    }
}
