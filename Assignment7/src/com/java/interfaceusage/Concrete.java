package com.java.interfaceusage;

public class Concrete implements BaseInterface{
    @Override
    public void baseFoo() {
        System.out.println("Base Interface function");
    }

    @Override
    public void foo1() {
        System.out.println("Interface1 function-1");
    }

    @Override
    public void bar1() {
        System.out.println("Interface1 function-2");
    }

    @Override
    public void foo2() {
        System.out.println("Interface2 function-1");
    }

    @Override
    public void bar2() {
        System.out.println("Interface1 function-2");
    }

    @Override
    public void foo3() {
        System.out.println("Interface3 function-1");
    }

    @Override
    public void bar3() {
        System.out.println("Interface3 function-2");
    }
}