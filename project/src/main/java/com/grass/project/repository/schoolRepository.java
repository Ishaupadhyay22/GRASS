package com.grass.project.repository;

import com.grass.project.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface schoolRepository extends JpaRepository<School, Integer> {
    School findByName(String name);
    School findById(int id);
}