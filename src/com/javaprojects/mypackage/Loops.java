package com.javaprojects.mypackage;

public class Loops {
    public static void main(String[] args){
        //Multiplication table 1-12 using for loop
        for (int i = 1; i<=12 ; i++){
            for (int j = 1; j<=12; j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
}