package com.ulisses.bank.application;

import com.ulisses.bank.entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class BankTerminalApp {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there na initial desposit (y/n)?: ");
        char resp = sc.next().charAt(0);
        if (resp == 'y' || resp == 'Y'){
            System.out.print("Enter initial deposit value: ");

            double initialDeposit = sc.nextDouble();
            account = new BankAccount(number, holder, initialDeposit);

        } else {
            account = new BankAccount(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(account);


        sc.close();
    }

}
