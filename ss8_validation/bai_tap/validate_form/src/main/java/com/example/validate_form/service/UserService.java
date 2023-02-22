package com.example.validate_form.service;

import com.example.validate_form.model.UserModel;
import com.example.validate_form.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository repository;
    @Override
    public List<UserModel> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(UserModel userModel) {
        repository.save(userModel);
    }
}
