package com.oreilly.section3;

import java.util.Scanner;

public class SumRepetition {
    public static void main(String[] args) {
        int sum=0;
        int input;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("enter non negative to add sum");
        System.out.println("or negative to exit");
        input=keyboard.nextInt();
        while(input>=0)
        {
            sum+=input;
            System.out.println("enter non negative to add sum");
            System.out.println("or negative to exit");
            input=keyboard.nextInt();
        }
        System.out.println("sum is "+sum);
    }
}
