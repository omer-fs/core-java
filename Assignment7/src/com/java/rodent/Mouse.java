package com.java.rodent;

public class Mouse extends Rodent{
    Mouse()
    {
        System.out.println("\nInside Mouse class\n");
    }

    @Override
    public void family()
    {
        System.out.println("Family: Muridae\n");
    }

    @Override
    public void habitat()
    {
        System.out.println("Habitat: House mouse typically like warmer climates, while brown rats live in temperate climates.\n");
    }
}
