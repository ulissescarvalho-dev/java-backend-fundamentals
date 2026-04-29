package com.ulisses.repetition.forloop;

import java.util.Scanner;

/*
Ex04:
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */

public class DynamicDivisionChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (b == 0) {
                System.out.println("Impossible division\n!!");
            } else {
                double division = a / b;
                System.out.println(division);
            }
        }
        sc.close();
    }
}
