package com.example.demo.Model;

import jakarta.persistence.*;

@Entity

@Table(name="user_dtls")
public class UserDtls {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "UserDtls [id=" + id +  ", email=" + email + ", password=" + password + "]";
    }




}
