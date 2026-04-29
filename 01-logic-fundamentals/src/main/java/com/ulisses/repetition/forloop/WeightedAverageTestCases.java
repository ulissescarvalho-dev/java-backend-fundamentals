package com.ulisses.repetition.forloop;

import java.util.Locale;
import java.util.Scanner;

/*
Ex03:
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
 */

public class WeightedAverageTestCases {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            double v1 = sc.nextDouble();
            double v2 = sc.nextDouble();
            double v3 = sc.nextDouble();

            double average = (v1 * 2.0 + v2 * 3.0 + v3 * 5.0) / 10;

            System.out.printf("%.1f%n", average);
        }

        sc.close();
    }

}
