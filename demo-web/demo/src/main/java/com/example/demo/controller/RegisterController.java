package com.example.demo.controller;

import java.util.Optional;

import jakarta.servlet.http.HttpSession;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.UserDtls;
import com.example.demo.Repository.userRepository;

@Controller
public class RegisterController {

    @Autowired
    private userRepository userRepository;




    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/register")
            public String registerpage()
    {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute UserDtls user) {
        user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
        userRepository.save(user);

        return "redirect:/";
    }
}
