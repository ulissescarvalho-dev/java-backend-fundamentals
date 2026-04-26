package com.ulisses.matrizes.diagonal.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i=0; i<n; i++){
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        int countNegatives = 0;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (matriz[i][j] < 0){
                    countNegatives++;
                }
            }
        }

        System.out.println("Negative Numbers: " + countNegatives);


        sc.close();
    }
}
