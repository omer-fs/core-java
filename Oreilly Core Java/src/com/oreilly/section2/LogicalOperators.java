package com.oreilly.section2;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean isRaining=true;
        boolean isWarm=false;
        boolean combined=isRaining && isWarm;
        System.out.println("is it raining and warm ? "+combined);

        combined=isRaining || isWarm;
        System.out.println("is it raining or warm ? "+combined);

        combined=!(isRaining);
        System.out.println("is it not raining ? "+combined);
    }
}
