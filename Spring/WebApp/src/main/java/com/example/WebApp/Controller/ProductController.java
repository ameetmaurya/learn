package com.example.WebApp.Controller;

import com.example.WebApp.Model.Product;
import com.example.WebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {
@Autowired
    ProductService service;
@RequestMapping("/product")
    public List<Product> getProduct()
    {
        return service.getProduct();
    }
    @RequestMapping("/product/{prodId}")
    public Product getProductById(@PathVariable int prodId)
    {
        return service.getProductById(prodId);
    }

}
