package com.java.assignment2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String str=ob.nextLine();

        AllAlphabets al=new AllAlphabets();
        System.out.println(al.check(str));
    }
}
