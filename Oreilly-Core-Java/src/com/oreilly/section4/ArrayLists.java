package com.oreilly.section4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        ArrayList<Double> myList=new ArrayList<>();
        double input;
        System.out.println("enter 0 or more to continue or -1 to exit");
        input=keyboard.nextDouble();
        while (input>=0)
        {
            myList.add(input);
            System.out.println("enter 0 or more to continue or -1 to exit");
            input=keyboard.nextDouble();
        }
        for(double num:myList)
        {
            System.out.println(num);
        }
    }
}
