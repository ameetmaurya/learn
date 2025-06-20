package com.app.demo.dto;

//DTO=Data transfer object


public class FDRequest {
    private double amount;
    private int duration; // in months
    private double interestRate;

    // Getters and Setters
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}


