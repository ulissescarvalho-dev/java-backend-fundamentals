package com.ulisses.sequential;

import java.util.Scanner;

/*
Ex01:
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
 */

public class SumTwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        int sum = a + b;

        System.out.printf("SUM = %s", sum);

        sc.close();

    }

}
