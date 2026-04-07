package com.ulisses.repetition.forloop;

import java.util.Scanner;

/*
Ex07:
Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
 */

public class PowerSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int first = i;
            int square = i * i;
            int cube = i * i * i;
            System.out.printf("%d %d %d%n", first, square, cube);
        }

        sc.close();
    }

}
