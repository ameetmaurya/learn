package com.example.SpringSecEx;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
 @RequestMapping("/")
    public String  greet(HttpServletRequest request)
    {
        return "hello world"+request.getSession().getId();
    }
}
