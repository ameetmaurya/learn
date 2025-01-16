package com.example.sqlconnector.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.example.sqlconnector.Repository.UserRepository;

@RestController
@RequestMapping("/book")

public class UserController {

    private final UserRepository userRepository;

}
