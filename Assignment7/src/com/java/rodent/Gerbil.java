package com.java.rodent;

public class Gerbil extends Rodent {
    Gerbil() {
        System.out.println("Inside Gerbil class\n");
    }

    @Override
    public void family() {
        System.out.println("Gerbil belong to Muridae Gerbillinae family");
    }

    @Override
    public void habitat() {
        System.out.println("Gerbils are desert or semi-desert species,inhabiting vast expanses of sandy territory");
    }

    @Override
    public void haveCanine() {
        System.out.println("Gerbils have Canines");
    }
}