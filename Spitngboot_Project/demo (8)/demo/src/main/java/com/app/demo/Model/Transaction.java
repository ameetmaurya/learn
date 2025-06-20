package com.app.demo.Model;

public class Transaction {
    private String description;
    private String type; // "Credit" or "Debit"
    private String date;
    private int amount;

    public Transaction(String description, String type, String date, int amount) {
        this.description = description;
        this.type = type;
        this.date = date;
        this.amount = amount;
    }

    public String getDescription() { return description; }
    public String getType() { return type; }
    public String getDate() { return date; }
    public int getAmount() { return amount; }
}
