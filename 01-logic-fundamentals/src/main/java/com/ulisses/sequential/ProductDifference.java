package com.ulisses.sequential;

import java.util.Scanner;

/*
Ex03:
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
 */

public class ProductDifference {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int difference = (a * b) - (c * d);

        System.out.println("difference = " + difference);

        sc.close();
    }
}
