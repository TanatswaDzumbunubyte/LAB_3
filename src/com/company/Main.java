package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       int number , i;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        number= sc.nextInt();
        i=2;

        System.out.println("List of even numbers: ");

        for (i=2;i<=number; i=i){
            System.out.println(i + " ");

            i=i+2;


        }
    }
}
