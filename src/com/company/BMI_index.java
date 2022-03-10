package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI_index {
    public static void main(String[] args) throws IOException
    {float heightTanatswa, weightTanatswa, bmiTanatswa;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The Program will calculate your BMI");
        System.out.println("Enter your height in cm and press enter; ");
        heightTanatswa= Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight in kg and press enter; ");
        weightTanatswa = Float.parseFloat(br.readLine());

        bmiTanatswa= (float) (weightTanatswa/(Math.pow(heightTanatswa,2)));
        System.out.printf("YOUR BMI IS; " + "%2.2f, \n",bmiTanatswa);

        if (bmiTanatswa<16) {
            System.out.println("you are slim/skinny/suffering from strvation");
        }else if ((bmiTanatswa>=16)&&(bmiTanatswa<16.99)) {
            System.out.println("you are emaciated");
        }else if ((bmiTanatswa>=17)&&(bmiTanatswa<18.49)) {
            System.out.println("you are underweight");
        }else if ((bmiTanatswa>=18.50)&&(bmiTanatswa<22.99)) {
            System.out.println("you are in the low range of the norm");
        }else if ((bmiTanatswa>=23)&&(bmiTanatswa<24.99)) {
            System.out.println("you are in the high range of the norm");
        }else if ((bmiTanatswa>=25)&&(bmiTanatswa<27.49)) {
            System.out.println("you are overweight pre-obese");
        }else if ((bmiTanatswa>=27)&&(bmiTanatswa<29.99)) {
            System.out.println("you are overweight");
        }else if ((bmiTanatswa>=30)&&(bmiTanatswa<34.49)) {
            System.out.println("you are 1st degree obesity");
        }else if ((bmiTanatswa>=35)&&(bmiTanatswa<39.99)) {
            System.out.println("you are 2nd degree obesity");
        }else if ((bmiTanatswa>=40)) {
            System.out.println("you are 3rd degree obesity");
        }



    }


}
