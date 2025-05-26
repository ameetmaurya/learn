package com.example.demo.controller;

import com.example.demo.Repository.userRepository;
import com.example.demo.entity.UserDtls;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;
@Controller
public class LoginController {

    @Autowired
    private userRepository userRepository;

    @GetMapping("/login")
    public String loginpage()
    {
        return "login";
    }
    @PostMapping("/login")
    public String login(@RequestParam(value = "email", required = false) String email,
                        @RequestParam(value = "password", required = false) String password,
                        Model model, HttpSession session) {

        if (email == null || password == null || email.isEmpty() || password.isEmpty() ) {
            model.addAttribute("error", "Email and password are required.");
            return "login";
        }

        Optional<UserDtls> userOptional = userRepository.findByEmail(email);

        if (userOptional.isPresent()) {
            UserDtls user = userOptional.get();

            if (BCrypt.checkpw(password, user.getPassword())) {
                model.addAttribute("user", user);
                return "redirect:/success";
            }
            else {
                model.addAttribute("error", "Invalid email or password.");
                return "login";
            }
        }


        // ❌ Login failed
        model.addAttribute("error", "Invalid email or password.");
        return "login";
    }

    @GetMapping("/success")
    public String successPage() {
        return "success";
    }
}
