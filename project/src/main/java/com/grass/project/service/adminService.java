package com.grass.project.service;

import com.grass.project.model.Admin;
import com.grass.project.model.grantType;
import com.grass.project.repository.adminRepository;
import com.grass.project.repository.grantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class adminService {
    @Autowired
    private adminRepository a_repo;
    @Autowired
    private grantRepository g_repo;


    public Admin saveAdmin(Admin admin) {
        return a_repo.save(admin);
    }

    public Admin getAdminById(int id) {
        return a_repo.findById(id);
    }

    public Admin getAdminByName(String name) {
        return a_repo.findByName(name);
    }

    public grantType addGrant(grantType grant){
        return g_repo.save(grant);
    }

    public grantType getGrantById(long id) {
        return g_repo.findById(id);
    }

    public String deleteAdmin(int id) {
        a_repo.deleteById(id);
        return "product removed !! " + id;
    }
}
