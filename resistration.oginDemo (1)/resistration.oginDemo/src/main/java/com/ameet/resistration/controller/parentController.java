package com.ameet.resistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class parentController {
     
    @GetMapping("/")
    @ResponseBody
  public String show()
  {
    return "Wlecome to spring ";
  }

}
