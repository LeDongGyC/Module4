package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sandwich")
public class SandwichController {
    @GetMapping("/list")
    public String list(){
        return "list";
    }
    @PostMapping("/save")
    public ModelAndView save(@RequestParam("condiment") String[] condiment){
        ModelAndView modelAndView = new ModelAndView("result","condiment",condiment);
//        modelAndView.addAllObjects("condiment",condiment);
        return modelAndView;
    }    @PostMapping("/save1")
    public String save1(@RequestParam("condiment") String[] condiment, Model model){
//        ModelAndView modelAndView = new ModelAndView("result","condiment",condiment);
//        modelAndView.addAllObjects("condiment",condiment);
        model.addAttribute("condiment",condiment);
        return "result";
    }
}
