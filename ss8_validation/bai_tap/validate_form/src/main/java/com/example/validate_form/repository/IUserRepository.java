package com.example.validate_form.repository;

import com.example.validate_form.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel,Integer> {
}
