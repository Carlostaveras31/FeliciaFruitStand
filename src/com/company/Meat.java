package com.company;

public class Meat extends Product {

    String animal;
    String protein;

    public Meat(){

    }

    public Meat(String name, double cost, int quantity, String animal, String protein){
        super(name, cost, quantity);

        this.animal = animal;
        this.protein = protein;

    }
}
