package com.example.service;

import com.example.bean.Email;

import java.util.List;

public interface IEmailService {
    List<Email> findAll();
    void saveEmail(Email email);
}
