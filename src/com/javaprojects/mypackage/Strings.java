package com.javaprojects.mypackage;

public class Strings {
    public static void main(String[] args){
        // - Declare a String variable with the following phrase "I never dreamed about success. I worked for it"
        String strPhrase = "I never dreamed about success. I worked for it";

        // - Print out the number of characters in that quote
        System.out.println(strPhrase.length());

        // - Declare a String variable with the following name "Estee Lauder"
        String strName = "Estee Lauder";

        // - Declare a quote variable and append name, dash and the phrase from strPhrase
        String  strQuote = "\""+strName.concat("-"+strPhrase)+"\"";
        System.out.println(strQuote);    // - Print out the whole quote

        // - Print out first 12 characters of the phrase
        System.out.println(strPhrase.substring(0,12));

        // - Print out the result of comparison of the following strings: "0CT0PUS" and "0CT0PUS"
        String str1 = "0CT0PUS";
        String str2 = "0CT0PUS";

        //String comparison using equals() Method
        System.out.println(str1.equals(str2));

        //String comparison using '==' operator
        if(str1 == str2){
            System.out.println("Both strings are equal and contain same value \"OCTOPUS\"");
        }else{
            System.out.println("Both strings are not equal and contain different values");
        }
    }
}