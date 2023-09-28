package com.javaprojects.mypackage;

public class Primitives {
    public static void main(String[] args) {
        //Assignment #1

        //Print Hello world!
        System.out.println("Hello world!");
        System.out.println("hi");


        //Assignment #2

        // - Declare a digit variable with 'price' name equal to $45
        int price = 45;
        System.out.println("$"+price);

        // - Declare a double type variable with 'discount' name equal to 20% as a decimal
        double discount = 20;
        System.out.println(discount + "%");

        // - Declare a double type variable with 'total' name that calculated the result
        double total = 45-(45 * 0.2);

        // - Print out the result of total due by a customer when purchasing a book that costs $45 with a 20% discount
        System.out.println("$"+total);

    }
}