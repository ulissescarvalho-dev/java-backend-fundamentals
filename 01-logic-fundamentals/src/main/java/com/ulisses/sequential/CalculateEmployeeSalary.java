package com.ulisses.sequential;

import java.util.Locale;
import java.util.Scanner;

/*
Ex04:
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
 */

public class CalculateEmployeeSalary {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int employeeNumber = sc.nextInt();

        int hoursWorked = sc.nextInt();

        double earningsPerHour = sc.nextDouble();

        double wage = (hoursWorked * earningsPerHour);

        System.out.printf("NUMBER = %d%n", employeeNumber);

        System.out.printf("SALARY = U$%.2f%n", wage);

        sc.close();

    }

}
