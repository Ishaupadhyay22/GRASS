package com.grass.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name =  "Admin", uniqueConstraints = @UniqueConstraint(columnNames = "govt_id"))
public class Admin extends registration {

    @Column
    private int govt_id;
    @Column
    private String role;



    /*public int getGovt_id() {
        return govt_id;
    }

    public void setGovt_id(int govt_id) {
        this.govt_id = govt_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }*/
}
