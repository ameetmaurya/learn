package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.UserDtls;
   
@Controller
public class UserController {

    @Autowired
    private com.example.demo.Repository.userRepository userRepository;

    @GetMapping("/")
    public String home() {
        return "index"; 
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute UserDtls user) {
        userRepository.save(user); 
        return "redirect:/";
    } 
}
