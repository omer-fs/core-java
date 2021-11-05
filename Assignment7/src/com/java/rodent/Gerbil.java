package com.java.rodent;

public class Gerbil extends Rodent{
    Gerbil()
    {
        System.out.println("\nInside Gerbil class\n");
    }

    @Override
    public void family()
    {
        System.out.println("Family: Muridae Gerbillinae");
    }

    @Override
    public void habitat()
    {
        System.out.println("Habitat: Gerbils are desert or semi-desert species,inhabiting vast expanses of sandy territory\n");
    }
}