package com.app.demo.Controller;

import com.app.demo.Controller.vo.LoginRequest;
import com.app.demo.Model.User;
import com.app.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserRegister {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/register")
    public String registeruser2(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @GetMapping("/loginpage")
    public String loginPage(Model model) {
        model.addAttribute("loginRequest", new LoginRequest());
        return "loginpage";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model) {
        if (userRepo.existsByUsername(user.getUsername())) {
            model.addAttribute("error", "Username already taken");
            return "register";
        }

        // No BCrypt encoding; storing plain password
        userRepo.save(user);

        return "redirect:/loginpage";
    }
}
