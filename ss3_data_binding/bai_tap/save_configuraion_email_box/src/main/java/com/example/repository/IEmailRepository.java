package com.example.repository;

import com.example.bean.Email;

import java.util.List;

public interface IEmailRepository {
    List<Email> findAll();
    void saveEmail(Email email);
}
