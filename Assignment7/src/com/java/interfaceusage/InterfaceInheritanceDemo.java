package com.java.interfaceusage;

public class InterfaceInheritanceDemo {
    public void method1(Interface1 temp){
        System.out.println("Takes Interface1 object as an argument");
    }

    public void method2(Interface2 temp){
        System.out.println("Takes Interface2 object as an argument");
    }

    public void method3(Interface3 temp){
        System.out.println("Takes Interface3 object as an argument");
    }

    public void method4(BaseInterface temp){
        System.out.println("Takes BaseInterface object as an argument");
    }
}
