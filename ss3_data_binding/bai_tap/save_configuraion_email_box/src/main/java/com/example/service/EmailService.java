package com.example.service;

import com.example.bean.Email;
import com.example.repository.IEmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmailService implements IEmailService{
    @Autowired
    private IEmailRepository iEmailRepository;
    @Override
    public List<Email> findAll() {
        return iEmailRepository.findAll();
    }

    @Override
    public void saveEmail(Email email) {
        iEmailRepository.saveEmail(email);
    }
}
