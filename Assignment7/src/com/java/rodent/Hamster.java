package com.java.rodent;

public class Hamster extends Rodent{
    Hamster()
    {
        System.out.println("\nInside Hamster class\n");
    }

    @Override
    public void family()
    {
        System.out.println("Family: Cricetidae");
    }

    @Override
    public void habitat()
    {
        System.out.println("Habitat: Hamsters like to live in warm, dry areas, sand dunes and the edges of deserts.\n");
    }
}