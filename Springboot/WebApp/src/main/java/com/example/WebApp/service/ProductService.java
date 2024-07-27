package com.example.WebApp.service;

import com.example.WebApp.Model.Product;
import com.example.WebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
//     List<Product> product = Arrays.asList(new Product(10000000,"Iphone",101),new Product(29999,"CAmera",102));

    public List<Product> getProduct() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod)
    {
        repo.save(prod);
    }

    public void deleteProduct(int prodId)
    {
        repo.deleteById(prodId);
    }


}
