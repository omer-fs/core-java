package com.oreilly.section1;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        double num1;
        double num2;
        double num3;
        System.out.println("enter three numbers : ");
        Scanner keyboard=new Scanner(System.in);
        num1=keyboard.nextDouble();
        num2=keyboard.nextDouble();
        num3=keyboard.nextDouble();
        double average=(num1+num2+num3)/3.0;
        System.out.println("average of three is : "+average);
    }
}
