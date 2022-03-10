package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class elements {
    public static void main(String[] args) throws IOException{

    double a, b, c, delta, x1 ,x2;
    char rootsNumbers=0;

    BufferedReader tj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The program will calculate the roots of the equation ax^2+bx+c =0  ");
        System.out.println("Input the value of a and press enter");
        a = Double.parseDouble(tj.readLine());

        if (a == 0) {
            System.out.println("unauthorised value of the co-efficient a. ");
        }
        else{
            System.out.println("input the value of b and press enter ");
            b=Double.parseDouble(tj.readLine());
            System.out.println("input value of c and press enter");
            c= Double.parseDouble(tj.readLine());

            delta = pow(b,2)-4*a*c;

            if(delta<0) rootsNumbers = 0;
            if(delta==0) rootsNumbers=1;
            if(delta>0) rootsNumbers=2;

            switch (rootsNumbers){
                case 0:
                    System.out.println("There is no real roots"); break;
                case 1: {
                    x1 = -b / (2 * a);
                    System.out.printf("For a = " + " %4.2f,",a);
                    System.out.printf("b ="+ "%4.2f,",b);
                    System.out.printf("c ="+ "%4.2f,",c);
                    System.out.printf("the trinomial has one double root=");
                    System.out.printf("%4.2f.\n",x1);
                }break;
                case 2:{
                    x1=(-b-sqrt(delta))/(2*a);
                    x2=(-b+sqrt(delta))/(2*a);
                    System.out.printf("For a = " + " %4.2f,",a);
                    System.out.printf("b ="+ "%4.2f,",b);
                    System.out.printf("c ="+ "%4.2f.\n",c);
                    System.out.printf("x1 = ");
                    System.out.printf("%4.2f.\n",x1);
                    System.out.printf("x2 = ");
                    System.out.printf("%4.2f.\n",x2);
                }break;
            }

        }


}
}
