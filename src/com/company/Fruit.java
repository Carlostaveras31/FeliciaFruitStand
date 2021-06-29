package com.company;

    public class Fruit extends Product {

        String shape;
        String color;

        public Fruit(){

        }

        public Fruit(String name, double cost, int quantity, String shape, String color){
            super(name, cost, quantity);
            this.shape = shape;
            this.color = color;
        }
}
