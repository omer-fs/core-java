package com.java.inner;

public class OuterClassA {
    public static class InnerClassA{
        InnerClassA(int a){
            System.out.println("Inner class A non-default constructor " + a);
        }
    }
}
