package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homecontroller
{
   @RequestMapping("/m")
    public String greet() 
    {
        return "Welcome to my channel";
    }
@RequestMapping("/about")
    public String about()
    {
        return "We love to teach";
    }
}