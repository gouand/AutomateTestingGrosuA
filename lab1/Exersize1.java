package org.example;

import java.util.Scanner;

public class Exersize1 {

    public Exersize1(){
        Scanner in = new Scanner(System.in);


        System.out.print("Enter temperature in Celsius: ");
        float C = in.nextFloat();


        float F = C * (9f / 5) + 32;


        System.out.println(C + " degree Celsius is equal to " + F +" degree Fahrenheit.");

    }
}
