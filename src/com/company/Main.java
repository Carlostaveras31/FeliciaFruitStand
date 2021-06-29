package com.company;

import java.util.ArrayList;

import java.util.List;

public class Main {

    public static void displayProducts(List<Product> items){

        for (Product listItem : items) {
            System.out.println(listItem.getClass().getSimpleName());
        }
    }

    public static void displayProducts(List<Product> items, String types){


        for (Product listItem : items) {
            if(listItem instanceof Meat && types == "Meat"){

                System.out.println(listItem.getClass().getSimpleName());
            }


        }


        System.out.println(types);
    }

//    Java how to find what class an object is
//            Object.getClass().getName();

    public static void main(String[] args) {
	// write your code here
        // write your code here
        List<Product> productList = new ArrayList<>();

        Meat ofMeatType1 = new Meat("Steak", 20.00, 2, "Cow", "Beef");
        Meat ofMeatType2 = new Meat("Chicken", 10.00, 6, "Chicken", "Poultry");
        Meat ofMeatType3 = new Meat("Fish", 7.00, 4, "Tuna", "Seafood");

        Fruit ofFruitType1 = new Fruit("Apple", 1.00, 6, "Circle", "Red");
        Fruit ofFruitType2 = new Fruit("Grapes", 5.00, 6, "Circles", "Purple");
        Fruit ofFruitType3 = new Fruit("Orange", 2.00, 4, "Circle", "Orange");

        productList.add(ofMeatType1);
        productList.add(ofMeatType2);
        productList.add(ofMeatType3);

        productList.add(ofFruitType1);
        productList.add(ofFruitType2);
        productList.add(ofFruitType3);


        displayProducts(productList, "Meat");
        System.out.println();
        System.out.println(ofMeatType1.getClass());

    }
}
