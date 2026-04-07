package com.ulisses.conditionals;

// Ex02: Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("PAIR");
        } else {
            System.out.println("ODD");
        }
        sc.close();
    }
}
