package com.company.ecommerce.models;


public class Product {
    private String name;
    private int id;
    private double price;

    // Constructor
    public Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {return name; }
    public int getId() {return id; }
    public double getPrice(){return price; }

    public void displayProduct(){
        System.out.println("Product Id: "+id+ ",Name: " + name + ", Price: $" + price);
    }
}