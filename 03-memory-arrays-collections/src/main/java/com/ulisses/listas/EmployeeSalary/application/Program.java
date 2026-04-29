package com.ulisses.listas.EmployeeSalary.application;

import com.ulisses.listas.EmployeeSalary.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered?: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.println();
            System.out.println("Emplyoee #" + (i+1) + ":");

            System.out.print("ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));

        }

        System.out.println();

        System.out.print("Enter the employee id that will have salary increase: ");
        double searchId = sc.nextInt();

        Employee emp = employees.stream().filter(x -> x.getId() == searchId).findFirst().orElse(null);

        if (emp != null){
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }else {
            System.out.println("This id does not exist!");
        }

        System.out.println();

        for (Employee x : employees){
            System.out.println(x);
        }

        sc.close();
    }

}
