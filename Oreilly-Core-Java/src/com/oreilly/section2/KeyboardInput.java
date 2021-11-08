package com.oreilly.section2;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        String city;
        double dubInput;
        System.out.println("what is your name ?");
        name = keyboard.nextLine();
        System.out.println("what is your age ?");
        age=keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("what is your real number ?");
        dubInput=keyboard.nextDouble();
        keyboard.nextLine();
        dubInput*=2;
        System.out.println("what is your city ?");
        city=keyboard.nextLine();
        System.out.println("Hello, "+name);
        System.out.println("age, "+age);
        System.out.println("city, "+city);
        System.out.println("double input, "+dubInput);
    }
}
