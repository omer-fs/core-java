package com.java.cycle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main class");

        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        System.out.println("\n------Upcasting----");

        Cycle[] cycle = new Cycle[3];
        cycle[0] = (Cycle) unicycle;
        cycle[1] = (Cycle) bicycle;
        cycle[2] = (Cycle) tricycle;

        System.out.println("\n----After Upcasting-----");
        cycle[0].balance();
        cycle[1].balance();
        cycle[2].balance();

        System.out.println("\n------Downcasting----");
        unicycle = (Unicycle) cycle[0];
        bicycle = (Bicycle) cycle[1];
        tricycle = (Tricycle) cycle[2];

        System.out.println("\n----After Downcasting-----");
        unicycle.balance();
        bicycle.balance();
        tricycle.balance();
    }
}
