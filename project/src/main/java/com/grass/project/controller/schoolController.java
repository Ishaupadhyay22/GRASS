package com.grass.project.controller;

import com.grass.project.model.School;
import com.grass.project.service.schoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class schoolController {
    @Autowired
    private schoolService service;

    @PostMapping("/School")
    public School addSchool(@RequestBody School school) {
        return service.saveSchool(school);
    }

    /*@GetMapping("/School/{id}")
    public School findSchoolById(@PathVariable int  id) {
        return service.getSchoolById(id);
    }*/

    @GetMapping("/School/{name}")
    public School findSchoolByName(@PathVariable String name) {
        return service.getSchoolByName(name);
    }


}
