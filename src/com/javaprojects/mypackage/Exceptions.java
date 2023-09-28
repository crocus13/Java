package com.javaprojects.mypackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args){

        //Assignment # 1: StringIndexOutOfBoundsException:
        // 1.) Declare a String variable named str with the value of "123"
        String str= "123";

        // 2.) Try and print the fourth value of our String using charAt() method
        try {
            System.out.println(str.charAt(4));
        }

        // 3.) Since we don't have a fourth value for the string, we will encounter an exception
        catch(StringIndexOutOfBoundsException e){
            System.out.println("This is why QA Engineers always have to do boundary testing!The string only has 3 values and you have requested a 4th");
        }
        finally{
            System.out.println("End of the program");
        }


        //Assignment # 2 : InputMismatchException using Scanner class
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number or integer");
        try{
            int myInteger = scan.nextInt();
            System.out.println("you entered" + " " +myInteger);
        }
        catch(InputMismatchException e){
            System.out.println("Please enter an integer or number");
        }

        scan.close();
    }
}