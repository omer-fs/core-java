package com.oreilly.section6;

public class MethodCalls {
    public static void main(String[] args) {
        doSomething();
    }
    public static void doSomething()
    {
        System.out.println("i'm doing something");
        int result=getSomeValue();
        System.out.println("result "+result);
    }
    public static int getSomeValue()
    {
        return 150;
    }
}
