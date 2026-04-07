package com.ulisses.sequential;

import java.util.Locale;
import java.util.Scanner;

/*
Ex06
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */

public class CalculateGeometricAreas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;

        a = sc.nextDouble();

        b = sc.nextDouble();
        c = sc.nextDouble();

        double triangle = (a * c) / 2;
        double circle = 3.14159 * (c * c);
        double trapeze = (a + b) * c / 2;
        double square = (b * b);
        double rectangle = (a * b);

        System.out.printf("TRIANGLE: %.3f%n", triangle);
        System.out.printf("CIRCLE: %.3f%n", circle);
        System.out.printf("TRAPEZE %.3f%n", trapeze);
        System.out.printf("SQUARE: %.3f%n", square);
        System.out.printf("RECTANGLE: %.3f%n", rectangle);

        sc.close();
    }

}
