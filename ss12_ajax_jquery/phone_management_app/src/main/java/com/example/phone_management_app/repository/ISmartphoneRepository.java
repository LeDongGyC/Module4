package com.example.phone_management_app.repository;

import com.example.phone_management_app.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISmartphoneRepository extends JpaRepository<Smartphone,Integer> {
}
