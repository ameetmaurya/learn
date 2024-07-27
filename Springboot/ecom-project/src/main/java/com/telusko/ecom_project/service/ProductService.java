package com.telusko.ecom_project.service;

import com.telusko.ecom_project.model.Product;
import com.telusko.ecom_project.repoistory.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
   @Autowired
    private ProductRepo repo;
    public List<Product> getAllProducts() {

        return repo.findAll();
    }

    public Product getProductsById(int id) {

        return repo.findById(id).orElse(new Product());
    }
}
