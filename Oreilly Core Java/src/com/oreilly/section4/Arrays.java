package com.oreilly.section4;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int someValues[]=new int[5];
        Scanner keyboard=new Scanner(System.in);
        for(int i=0;i<someValues.length;i++)
        {
            System.out.println("enter integer\t");
            someValues[i]=keyboard.nextInt();
        }
        for(int i=0;i<someValues.length;i++)
        {
            someValues[i]*=2;
            System.out.println("result is "+someValues[i]);
        }
    }
}
