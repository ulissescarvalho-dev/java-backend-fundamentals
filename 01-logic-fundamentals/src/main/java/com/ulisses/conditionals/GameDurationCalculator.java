package com.ulisses.conditionals;

import java.util.Scanner;

/*
Ex04: Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */

public class GameDurationCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int startTime = sc.nextInt();
        int endTime = sc.nextInt();

        int duration;
        if (startTime < endTime) {
            duration = endTime - startTime;
        } else {
            duration = 24 - startTime + endTime;
        }

        System.out.println("the game lasted " + duration + " hour(s).");

        sc.close();

    }
}
