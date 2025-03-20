package com.example.budgetandroid;

public class Transaction {
    private String title;
    private double amount;
    private String type;
    private String date;

    public Transaction(String title, double amount, String type, String date) {
        this.title = title;
        this.amount = amount;
        this.type = type;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }
}