package com.example.validate_form.controller;

import com.example.validate_form.dto.UserDto;
import com.example.validate_form.model.UserModel;
import com.example.validate_form.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService service;

    @GetMapping("/list")
    public String home(Model model) {
        model.addAttribute("userList", service.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "create";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute UserDto userDto, BindingResult bindingResult) {
        new UserDto().validate(userDto, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "create";
        }
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userDto, userModel);
        service.save(userModel);
        return "redirect:/user/list";
    }
}
