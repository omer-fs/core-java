package com.java.rodent;

public class Hamster extends Rodent {
    Hamster() {
        System.out.println("Inside Hamster class\n");
    }

    @Override
    public void family() {
        System.out.println("Hamsters belong to Cricetidae family");
    }

    @Override
    public void habitat() {
        System.out.println("Hamsters like to live in warm, dry areas, sand dunes and the edges of deserts.");
    }

    @Override
    public void haveCanine() {
        System.out.println("Hamsters have Canine");
    }
}