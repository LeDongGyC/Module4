package com.example.controller;

import com.example.bean.Email;
import com.example.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private IEmailService iEmailService;

    @ModelAttribute("languages")
    public String[] languagesList() {
        return new String[]{"English", "Vietnamese", "Japanese", "Chinese"};
    }

    @ModelAttribute("sizes")
    public String[] sizeList() {
        return new String[]{"5", "10", "15", "25", "50", "75", "100"};
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("emailList", iEmailService.findAll());
//        model.addAttribute("array",new String[]{iEmailService})
        return "list";
    }

    @GetMapping("/create")
    public String showForm(Model model) {
        model.addAttribute("email", new Email());
        return "create";
    }
    @PostMapping("/create")
    public String save(@ModelAttribute Email email,Model model){
        iEmailService.saveEmail(email);
        model.addAttribute("emailList", iEmailService.findAll());
        return "list";
    }
}
