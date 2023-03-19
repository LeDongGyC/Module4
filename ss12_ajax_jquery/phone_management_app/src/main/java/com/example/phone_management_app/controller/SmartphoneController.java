package com.example.phone_management_app.controller;

import com.example.phone_management_app.model.Smartphone;
import com.example.phone_management_app.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/phone")
public class SmartphoneController {
    @Autowired
    ISmartphoneService service;

    @GetMapping("")
    public ResponseEntity<List<Smartphone>> home() {
        List<Smartphone> smartphoneList = service.findAll();
        if (smartphoneList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(smartphoneList, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Smartphone smartphone) {
        service.save(smartphone);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePhone(@PathVariable int id){
        service.removeById(id);
    }
}
