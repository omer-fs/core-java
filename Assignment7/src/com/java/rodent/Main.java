package com.java.rodent;

public class Main {
    public static void main(String[] args)
    {
        Rodent[] rodent = new Rodent[3];

        // initialized with mouse class
        rodent[0] = new Mouse();
        rodent[0].family();

        // initialized with gerbil class
        rodent[1] = new Gerbil();

        // initialized with hamster class
        rodent[2] = new Hamster();
    }
}
