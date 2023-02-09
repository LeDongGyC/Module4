package com.example.repository;

import com.example.bean.Email;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class EmailRepository implements IEmailRepository{
    private static List<Email> emailList;
    static {
        emailList = new ArrayList<>();
        emailList.add(new Email("English",25,"enable spams filter","Thor"));
        emailList.add(new Email("Vietnamese",50,"enable spams filter","Thor"));
        emailList.add(new Email("Japanese",75,"enable spams filter","Thor"));
        emailList.add(new Email("Chinese",100,"enable spams filter","Thor"));
    }
    @Override
    public List<Email> findAll() {
        return emailList;
    }

    @Override
    public void saveEmail(Email email) {
        emailList.add(email);
    }
}
