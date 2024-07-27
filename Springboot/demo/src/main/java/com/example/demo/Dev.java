package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Dev {
  
    // public void build()
    
    // {
    //     System.out.println("hello bro");
    // }
    @Autowired 
   private  Laptop laptop;

    public void build()
    {
        laptop.compile();
    }
}

