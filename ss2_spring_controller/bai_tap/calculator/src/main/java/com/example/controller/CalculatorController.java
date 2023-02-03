package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {
    @GetMapping("/")
    public String display() {
        return "index";
    }

    @PostMapping("/")
    public String calculator(@RequestParam(required = false, defaultValue = "0") int num1, @RequestParam(required = false, defaultValue = "0") int num2, @RequestParam String operator, Model model) {
        int result = 0;
        switch (operator) {
            case "Addition(+)":
                result = num1 + num2;
                break;
            case "Subtraction(-)":
                result = num1 - num2;
                break;
            case "Multiplication(*)":
                result = num1 * num2;
                break;
            case "Division(/)":
                result = num1 / num2;
                break;
        }
        model.addAttribute("result",result);
        model.addAttribute("num1",num1);
        model.addAttribute("num2",num2);
        model.addAttribute("operator",operator);
        return "index";
    }
}
