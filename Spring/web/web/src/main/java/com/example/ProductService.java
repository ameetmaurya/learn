 package com.example.web;

import java.util.Arrays;
@service
public class ProductService {
   list<Product> product = Arrays.asList(new product(new Product(101,"IPhone",4000),new Product(102,"canon camera",40000)));

    public list<Product> getProducts() 
    {
        return product;
    }
    
 }