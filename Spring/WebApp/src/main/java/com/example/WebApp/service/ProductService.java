package com.example.WebApp.service;

import com.example.WebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
     List<Product> product = Arrays.asList(new Product(10000000,"Iphone",101),new Product(29999,"CAmera",102));

    public List<Product> getProduct()
    {
        return product;
    }

    public Product getProductById(int prodId) {
        return product.stream()
                .filter(p->p.getProId() == prodId)
                .findFirst().get();
    }
}
