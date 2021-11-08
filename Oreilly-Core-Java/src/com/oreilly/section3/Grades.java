package com.oreilly.section3;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        char grade;
        System.out.println("enter a grade");
        grade=keyboard.next().charAt(0);
        switch (grade) {
            case 'A' : System.out.println("great job");
            case 'B' : System.out.println("good job");
            case 'C' : System.out.println("you can do better");
            case 'D' : System.out.println("your are getting close to failing");
            case 'F' : System.out.println("you are failing the course");
            default : System.out.println("you have entered invalid grade");
        }
    }
}
