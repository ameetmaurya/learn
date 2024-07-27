package com.example.WebApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity

public class Product
{
 @Id
    private int proId;
    private  String prodName;
    private  int prize;

    public  Product(){
    }
    public Product(int prize, String prodName, int proId) {
        this.prize = prize;
        this.prodName = prodName;
        this.proId = proId;

    }

    public int getPrize() {
        return prize;
    }
    public void setPrize(int prize) {
        this.prize = prize;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }



    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }



}

