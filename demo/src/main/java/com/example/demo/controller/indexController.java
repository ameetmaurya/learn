package com.example.demo.controller;

import com.example.demo.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class indexController {
    @GetMapping("/")
    public String login() {
    return "index";  
    }
   
    @PostMapping("/register")
    public String userRegstration(@ModelAttribute User user,Model model)
    {
        System.out.println(user.toString());

        System.out.println(user.getFname());
        System.out.println(user.getLname());
        System.out.println(user.getDob());
        System.out.println(user.getEmail());
    
            // model.addAttribute("Firstname",user.getFname());

            //     model.addAttribute("lastname",user.getLname());
        return "welcome";
    }

}
