package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    private static Map<String, String> map;
    static {
        map = new HashMap<>();
        map.put("hello","xin chào");
        map.put("goodbye","tạm biệt");
        map.put("pen","cây bút");
        map.put("dead","cái chết");
        map.put("end","kết thúc");
    }
    @GetMapping("dictionary")
    public String getWord(){
        return "dictionary";
    }
    @PostMapping("dictionary")
    public String translate(@RequestParam String word, Model model){
        String result = map.get(word);
        model.addAttribute("result",result);
        model.addAttribute("word",word);
        return "dictionary";
    }
}
