package com.telusko.ecom_project.controller;
import jakarta.persistence.GeneratedValue;
import org.springframework.web.bind.annotation.*;
import com.telusko.ecom_project.model.Product;
import com.telusko.ecom_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService service;

    @RequestMapping("/greet")
    public String greet()
    {
        return "Welcome to my chaneel";
    }




    @RequestMapping("/products")
    
    public List<Product> getAllProduct()
    {
        return service.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@ParthVariable int id)
    {
      return service.getProductsById(id);
    }



}



