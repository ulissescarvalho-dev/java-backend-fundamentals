package com.ulisses.repetition.whileloop;
import java.util.Scanner;

/*
Ex02:
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma)
 */

public class IndeterminateQuadrantCoordinates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while(x !=0 && y !=0){
            if(x > 0 && y > 0){
                System.out.println("First Quadrant");
            }
            else if(x < 0 && y > 0){
                System.out.println("Second Quadrant");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Third Quadrant");
            }
            else {
                System.out.println("fourth quadrant");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }

}
