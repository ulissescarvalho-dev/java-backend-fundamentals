package com.ulisses.repetition.whileloop;

import java.util.Scanner;

/*
Ex01:
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */

public class PasswordValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int password = 2002;

        password = sc.nextInt();

        while (password != 2002) {
            System.out.println("invalid password");
            password = sc.nextInt();
        }

        System.out.println("Access Allowed");
        sc.close();
    }

}
