package com.ulisses.repetition.forloop;

import java.util.Scanner;

/*
Ex05:
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.

 */

public class FactorialCalculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 1;

        for (int i = n; i <= 1; i--) {
            result = result * i;
        }

        System.out.println(result);

        sc.close();
    }

}
