package com.company;

import java.io.IOException;
import java.util.Scanner;

public class simplecalculator {
    public static void main(String[] args) {

        float firstnumberTanatswa, secondnumberTanatswa, sum, substraction, product, qoutient;


        Scanner isa = new Scanner(System.in);

        System.out.println("The program calculates sum, difference, product and qoutient fortwo numbers. ");
        System.out.println("Enter the first number and press enter ");
        firstnumberTanatswa= isa.nextFloat();
        System.out.println("Enter the second number and press enter ");
        secondnumberTanatswa= isa.nextFloat();

        sum= firstnumberTanatswa+secondnumberTanatswa;
        substraction= firstnumberTanatswa-secondnumberTanatswa;
        product=firstnumberTanatswa*secondnumberTanatswa;
        qoutient=firstnumberTanatswa/secondnumberTanatswa;

        System.out.printf("you have entered two numbers , the first is:"+"%2.2f",firstnumberTanatswa);
        System.out.printf("your second number is :" + "%2.2f", secondnumberTanatswa);

        System.out.println();

        System.out.printf("sum= "+"%2.2f,\n",+ sum );
        System.out.printf("difference= "+"%2.2f,\n",+ substraction );
        System.out.printf("product= "+"%2.2f,\n",+ product );
        System.out.printf("qoutient= "+"%2.2f,\n",+ qoutient );
    }
}