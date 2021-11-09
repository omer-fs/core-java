package com.java.inner;

public class OuterClassB {
    public static class InnerClassB extends OuterClassA.InnerClassA {
        InnerClassB(int a) {
            super(a);
            System.out.println("ClassB");
        }
    }
}
