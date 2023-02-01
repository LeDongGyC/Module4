package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping("/convert")
    public String getCurrency(){
        return "convert";
    }
    @PostMapping("/convert")
    public String convert(@RequestParam double rate, double usd, Model model){
        double vnd = rate * usd;
        model.addAttribute("vnd",vnd);
        return "convert";
    }
}
