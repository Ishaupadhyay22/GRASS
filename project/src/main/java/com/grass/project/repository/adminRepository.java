package com.grass.project.repository;

import com.grass.project.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;


public interface adminRepository extends JpaRepository<Admin, Integer> {
    Admin findByName(String name);
    Admin findById(int id);
}
