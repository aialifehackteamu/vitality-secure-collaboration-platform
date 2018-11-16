package com.aiahackathon.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    @Column(name="rating_id")
    private Long id;

    private String name;
    private String vitalityid;
    private String gender;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVitalityid() {
        return vitalityid;
    }

    public void setVitalityid(String vitalityid) {
        this.vitalityid = vitalityid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }




}
