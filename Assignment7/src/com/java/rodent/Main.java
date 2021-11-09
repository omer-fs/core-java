package com.java.rodent;

public class Main {
    public static void main(String[] args)
    {
        Rodent[] rodent = new Rodent[3];

        // initialized with mouse class
        rodent[0] = new Mouse();
        rodent[0].family();
        rodent[0].habitat();
        rodent[0].haveCanine();

        // initialized with gerbil class
        rodent[1] = new Gerbil();
        rodent[1].family();
        rodent[1].habitat();
        rodent[1].haveCanine();

        // initialized with hamster class
        rodent[2] = new Hamster();
        rodent[2].family();
        rodent[2].habitat();
        rodent[2].haveCanine();
    }
}
