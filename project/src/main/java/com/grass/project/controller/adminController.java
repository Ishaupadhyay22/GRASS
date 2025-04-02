package com.grass.project.controller;

import com.grass.project.model.Admin;
import com.grass.project.model.grantType;
import com.grass.project.service.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class adminController {
    @Autowired
    private adminService service;


    @PostMapping("/Admin")
    public Admin addSchool(@RequestBody Admin admin) {
        return service.saveAdmin(admin);
    }
    @GetMapping("/Admin/{name}")
    public Admin findAdminByName(@PathVariable String name) {
        return service.getAdminByName(name);
    }
    @PostMapping("/grant")
    public grantType addGrant(@RequestBody grantType grant) {
        return service.addGrant(grant);
    }

    @GetMapping("/grant/{id}")
    public grantType findGrant(@PathVariable long id) {
        return service.getGrantById(id);
    }
}
