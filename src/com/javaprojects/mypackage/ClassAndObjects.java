package com.javaprojects.mypackage;

public class ClassAndObjects {
    public static void main(String[] args) {

        System.out.println("Assignment");

        // - Finish up the logic that calculates the balance
        // - Create a method that withdraws from the balance
        // - Check that if a bank customer deposits $500, $150 and $35 and then
        // withdraws $40 and $120 the balance is correct
        // - Print out a meaningful message if it is correct and if not

        BankingAccount2 myAccount = new BankingAccount2();
        myAccount.deposit(500);
        myAccount.deposit(150);
        myAccount.deposit(35);
        myAccount.withdraw(40);
        myAccount.withdraw(120);
        if (myAccount.balance == 525){
            System.out.println("The balance is correct and is " + "$" + myAccount.balance);
        }
        else{
            System.out.println("Incorrect balance and the correct balance is " + "$" + myAccount.balance);
        }
    }
}

class BankingAccount2 {

    public int balance;

    // method for deposit
    public void deposit(int sum){
        balance += sum;
    }
    // method for withdrawal
    public void withdraw(int sum){
        balance -= sum;
    }
}