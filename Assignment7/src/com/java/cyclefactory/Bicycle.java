package com.java.cyclefactory;

public class Bicycle implements Cycle{
    @Override
    public void balance() {
        System.out.println("It has moderate balance");
    }

    @Override
    public void wheels() {
        System.out.println("It has two wheel");
    }

    @Override
    public void build() {
        System.out.println("Bicycle manufactured");
    }
}