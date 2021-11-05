package com.java.inner;

public class OuterA {
    public static class InnerA{
        InnerA(int a){
            System.out.println("Inner class A non-default constructor " + a);
        }
    }
}
