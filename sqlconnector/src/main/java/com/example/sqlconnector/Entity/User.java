package com.example.sqlconnector.Entity;

import java.lang.annotation.Target;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fnamel;
    private String lname;
    public Long getId() {
        return id;
    }
    public String getFnamel() {
        return fnamel;
    }
    public String getLname() {
        return lname;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setFnamel(String fnamel) {
        this.fnamel = fnamel;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }





}
