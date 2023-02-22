package com.example.validate_form.service;

import com.example.validate_form.model.UserModel;

import java.util.List;

public interface IUserService {
    List<UserModel> findAll();
    void save(UserModel userModel);
}
