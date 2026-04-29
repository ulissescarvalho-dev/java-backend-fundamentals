package com.ulisses.geometry.application;

import com.ulisses.geometry.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class GeometryApplication {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA = %.2f", rectangle.area());
        System.out.println();
        System.out.printf("PERIMETER = %.2f", rectangle.perimeter());
        System.out.println();
        System.out.printf("DIAGONAL = %.2f", rectangle.diagonal());

        sc.close();
    }

}
