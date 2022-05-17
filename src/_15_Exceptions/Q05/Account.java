package _15_Exceptions.Q05;

import java.util.Scanner;

public class Account {

    private String accountNumber;
    private int balance;

    Scanner scan = new Scanner(System.in);

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account() {
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {return balance;}

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit() {

        System.out.println("your deposit: " + balance);
        System.out.println("Yatirmak istediginiz miktar: ");
        int depositAmount;
        try {
            depositAmount = scan.nextInt();

            if (depositAmount < 0) {
                throw new Exception();
            } else {
                balance += depositAmount;
                System.out.println("isleminiz gerceklesti");
                System.out.println("new deposit: " + balance);
            }

        } catch (Exception e) {
            System.out.println("Gecerli bir miktar giriniz");
        }


    }

    public void withdraw() {
        System.out.println("your deposit: " + balance);
        System.out.println("Cekmek istediginiz miktar: ");
        int withdrawAmount;
        try {
            withdrawAmount = scan.nextInt();

            if (withdrawAmount > 5000 || withdrawAmount > balance || withdrawAmount < 0) {
                throw new Exception();
            } else {
                balance -= withdrawAmount;
                System.out.println("isleminiz gerceklesti");
                System.out.println("new deposit: " + balance);
            }


        } catch (Exception e) {
            System.out.println("Gecerli bir miktar giriniz");
            System.out.println("Not: cekmek istediginiz miktar 0'dan kucuk, 5000'den buyuk ve bakiyenizden buyuk olamaz.");
        }


    }


}
