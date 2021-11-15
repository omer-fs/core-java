package com.java.assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();

        CheckAlphabets obj = new CheckAlphabets();
        System.out.println(obj.check(str));
    }
}
