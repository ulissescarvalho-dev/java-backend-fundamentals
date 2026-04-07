package com.ulisses.repetition.forloop;

import java.util.Scanner;

/*
Ex02:
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */

public class InAndOutIntervalCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            if (10 <= x && x <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }
        }
        System.out.println("in: " + in);
        System.out.println("out: " + out);

        sc.close();
    }

}
