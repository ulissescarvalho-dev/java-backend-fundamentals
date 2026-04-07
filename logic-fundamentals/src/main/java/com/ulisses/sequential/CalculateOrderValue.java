package com.ulisses.sequential;

import java.util.Locale;
import java.util.Scanner;

/*
Ex05:
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

 */

public class CalculateOrderValue {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int partCode1, partCode2;
        int quantity1, quantity2;
        double unitPrice1, unitPrice2;
        double totalAmount;

        partCode1 = sc.nextInt();
        quantity1 = sc.nextInt();
        unitPrice1 = sc.nextDouble();

        partCode2 = sc.nextInt();
        quantity2 = sc.nextInt();
        unitPrice2 = sc.nextDouble();

        totalAmount = (unitPrice1 * quantity1) + (unitPrice2 * quantity2);

        System.out.printf("TOTAL TO PAY: $ %.2f%n", totalAmount);

        sc.close();
    }
}
