package main;
import bank.BankAccount;


public class Main {
   public static void main(String[] args) {
       BankAccount account = new BankAccount();
       account.accountNumber = 123456;
       account.accountHolder = "John Doe";
       account.balance = 1000.0;

       System.out.println("Account Number: " + account.accountNumber);
       System.out.println("Account holder: " + account.accountHolder);
       System.out.println("Account balance: " + account.balance);
   }
}
