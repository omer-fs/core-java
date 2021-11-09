package com.java.rodent;

public class Mouse extends Rodent{
    Mouse()
    {
        System.out.println("Inside Mouse class\n");
    }

    @Override
    public void family() {
        System.out.println("Family: Muridae");
    }

    @Override
    public void habitat() {
        System.out.println("House mouse typically like warmer climates, while brown rats live in temperate climates.");
    }

    @Override
    public void haveCanine() {
        System.out.print("Does not have Canine");
    }
}
