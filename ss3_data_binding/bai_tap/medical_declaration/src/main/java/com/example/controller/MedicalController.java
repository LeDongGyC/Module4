package com.example.controller;

import com.example.bean.Medical;
import com.example.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/medical")
public class MedicalController {
    @Autowired
    private IMedicalService iMedicalService;
    @ModelAttribute("yearOfBirthday")
    public String[] listYear(){
        return new String[]{"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999"};
    }
    @ModelAttribute("genders")
    public String[] listGerder(){
        return new String[]{"Nam","Nữ","Bê đê"};
    }
    @ModelAttribute("country")
    public String[] listCountry(){
        return new String[]{"Việt Nam","Mẽo","Tàu Khựa","Hàn Xẻng","Nhật Bỏn"};
    }
    @ModelAttribute("day")
    public String[] listDay(){
        return new String[]{"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    }
    @ModelAttribute("month")
    public String[] listMonth(){
        return new String[]{"01","02","03","04","05","06","07","08","09","10","11","12"};
    }
    @ModelAttribute("year")
    public String[] listYear1(){
        return new String[]{"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};
    }

    @GetMapping("/list")
    public String home(Model model){
        model.addAttribute("medicalList",iMedicalService.findAll());
        return "list";
    }
    @GetMapping("/create")
    public String showForm(Model model){
        model.addAttribute("medical",new Medical());
        return "create";
    }
    @PostMapping("/create")
    public String save(@ModelAttribute Medical medical,Model model){
        iMedicalService.save(medical);
        model.addAttribute("medicalList",iMedicalService.findAll());
        return "list";
    }
}
