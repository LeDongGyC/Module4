package com.codegym.controller;

import com.codegym.model.Music;
import com.codegym.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/music")
public class MusicController {
    @Autowired
    IMusicService iMusicService;

    @GetMapping("/list")
    public String home(Model model) {
        model.addAttribute("musicList", iMusicService.findAll());
        return "list";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("music",new Music());
        return "create";
    }
    @PostMapping("/create")
    public String save(@ModelAttribute Music music){
        iMusicService.create(music);
        return "redirect:/music/list";
    }
    @GetMapping("/edit/{id}")
    public String showEditForm(Model model, @PathVariable int id){
        model.addAttribute("music",iMusicService.findById(id));
        return "edit";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute Music music){
        iMusicService.update(music.getId(), music);
        return "redirect:/music/list";
    }

    @GetMapping("/delete/{id}")
    public String showDeleteForm(Model model, @PathVariable int id) {
        model.addAttribute("music", iMusicService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Music music) {
        iMusicService.remove(music);
        return "redirect:/music/list";
    }
}
