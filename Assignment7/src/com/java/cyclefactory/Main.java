package com.java.cyclefactory;

public class Main {
    public static void main(String[] args)
    {
        UnicycleFactory unicycleFactory = new UnicycleFactory();
        Cycle newUnicycle = unicycleFactory.buildUnicycle();
        newUnicycle.build();

        BicycleFactory bicycleFactory = new BicycleFactory();
        Cycle newBicycle = bicycleFactory.buildBicycle();
        newBicycle.build();

        TricycleFactory tricycleFactory = new TricycleFactory();
        Cycle newTricycle = tricycleFactory.buildTricycle();
        newTricycle.build();
    }
}
