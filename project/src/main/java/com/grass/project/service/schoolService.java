package com.grass.project.service;

import com.grass.project.model.School;
import com.grass.project.repository.schoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class schoolService {
    @Autowired
    private schoolRepository s_repo;

    public School saveSchool(School product) {
        return s_repo.save(product);
    }

    public School getSchoolById(int id) {
        return s_repo.findById(id);
    }

    public School getSchoolByName(String name) {
        return s_repo.findByName(name);
    }

    public String deleteSchool(int id) {
        s_repo.deleteById(id);
        return "product removed !! " + id;
    }

}
