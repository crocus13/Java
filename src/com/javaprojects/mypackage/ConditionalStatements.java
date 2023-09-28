package com.javaprojects.mypackage;

public class ConditionalStatements {
    public static void main(String[] args){

        //ASSIGNMENT :1 -> USING IF...ELSE ,EVEN OR ODD NUMBERS:

        // 1.Declare an int variable with the value of 75 (any variable name would do)
        int num = 346;

        // 2.Write an if/else statement to check and if our int variable is an even or odd number (using modulo/remainder operator %)
        if ((num % 2) == 0){
            System.out.println("It's an even number");
        }
        else{
            System.out.println("It's an odd number");
        }


        // ASSIGNMENT :2 ->USING SWITCH..CASE TO DETERMINE THE DAY OF THE WEAK:

        // 1. Declare an int variable named day, with the value of 6
        int day = 4;

        // 2. Write a switch case statement to determine the day of the week based on our int variable value
        switch (day){
            case 1:
                System.out.println("It's Sunday");
                break;
            case 2:
                System.out.println("It's Monday");
                break;
            case 3:
                System.out.println("It's Tuesday");
                break;
            case 4:
                System.out.println("It's Wednesday");
                break;
            case 5:
                System.out.println("It's Thursday");
                break;
            case 6:
                System.out.println("It's Friday");
                break;
            case 7:
                System.out.println("It's Saturday");
                break;
        }


        // ASSIGNMENT :3 -> GRADING SYSTEM:

        // 1. Declare an int variable named grade, with a value of 80
        int grade = 80;
        // 2. Let's create an  if - else - if statement and logical operators, check the value of int variable grade belongs to which range

        // 3. First condition, when grade ranges 90-100, print out "Excellent! Your homework grade is A!"
        if ((grade >= 90) && (grade<= 100)){
            System.out.println("Excellent! Your homework grade is A!");
        }

        // 4. Next condition, when grade ranges 80-89, print out "Great work! Your homework grade is B!"
        else if((grade >= 80) && (grade<= 89)){
            System.out.println("Great work! Your homework grade is B");
        }

        // 5.Next condition, when grade ranges 70-79, print out "Improvement needed! Your homework grade is C!"
        else if((grade >= 70) && (grade<= 79)){
            System.out.println("Improvement needed! Your homework grade is C");
        }

        // 6.Next condition, when grade ranges 60-69, print out "Close fail, try harder! Your homework grade is D!"
        else if((grade >= 60) && (grade<= 69)){
            System.out.println("Close fail, Try harder.Your homework grade is D");
        }

        // 7. Next condition, when grade ranges 0-59, print out "Sorry, failed,try again! Your homework grade is F!"
        else if((grade >= 0 )&& (grade<= 59)){
            System.out.println("Sorry,failed,Try again .Your homework grade is F");
        }

        // 8. For our else statement, if the grade value is not within the grade conditions, print "Invalid homework grade!"
        else{
            System.out.println("Invalid homework grade");
        }
    }
}