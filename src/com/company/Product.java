package com.company;

public class Product {
    //properties
    String name;
    double cost;
    int quantity;

    //default constructor incase we need it empty
    public Product(){

    }

    public Product(String name, double cost, int quantity){
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;

    }


}
