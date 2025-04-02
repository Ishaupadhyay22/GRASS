package com.grass.project.repository;

import com.grass.project.model.grantType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface grantRepository extends JpaRepository<grantType, Integer> {
    grantType findById(long id);
}
