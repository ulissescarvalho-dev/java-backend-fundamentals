package com.ulisses.academic.application;


import com.ulisses.academic.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class GradingSystemApp {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();

        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f\n", student.finalGrade());

        if (student.finalGrade() < 60){
            System.out.println("FAILED");
            System.out.printf("FALTARAM %.2f PONTOS%n", student.missingPoints());
        } else {
            System.out.println("PASS!");        }

        sc.close();
    }

}
