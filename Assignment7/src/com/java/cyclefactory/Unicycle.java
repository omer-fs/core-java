package com.java.cyclefactory;

public class Unicycle implements Cycle{
    @Override
    public void balance() {
        System.out.println("It has least balance");
    }

    @Override
    public void wheels() {
        System.out.println("It has one wheel");
    }

    @Override
    public void build() {
        System.out.println("Unicycle manufactured");
    }
}
