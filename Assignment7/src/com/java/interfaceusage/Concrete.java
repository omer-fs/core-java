package com.java.interfaceusage;

public class Concrete implements BaseInterface{
    @Override
    public void method() {
        System.out.println("Base Interface method");
    }

    @Override
    public void first1() {
        System.out.println("Interface1 method-1");
    }

    @Override
    public void first2() {
        System.out.println("Interface1 method-2");
    }

    @Override
    public void second1() {
        System.out.println("Interface2 method-1");
    }

    @Override
    public void second2() {
        System.out.println("Interface1 method-2");
    }

    @Override
    public void third1() {
        System.out.println("Interface3 method-1");
    }

    @Override
    public void third2() {
        System.out.println("Interface3 method-2");
    }
}