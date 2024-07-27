package com.example.WebApp.repository;

import com.example.WebApp.Model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {


}
