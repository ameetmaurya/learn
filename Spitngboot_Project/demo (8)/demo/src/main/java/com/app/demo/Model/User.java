package com.app.demo.Model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data //genrate geter and seter
@Table(name="Student_DTLS")
public class User {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
    private  int id;
   @Column(unique = true)
    private  String username ;
    private String password;
    private String phone;
}

