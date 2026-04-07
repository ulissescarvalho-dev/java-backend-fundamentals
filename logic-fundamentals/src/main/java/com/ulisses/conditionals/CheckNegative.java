package com.ulisses.conditionals;

import java.util.Scanner;

/*
Ex01: Fazer um programa para ler um número inteiro, e depois
dizer se este número é negativo ou não.
 */

public class CheckNegative {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("NOT NEGATIVE");
        } else if (number < 0) {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
