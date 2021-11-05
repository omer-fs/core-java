package com.java.interfaceusage;

public class InterfaceInheritanceDemo {
    public void method1(Interface1 temp){
        System.out.println("takes interface1 object");
    }

    public void method2(Interface2 temp){
        System.out.println("takes interface2 object");
    }

    public void method3(Interface3 temp){
        System.out.println("takes interface3 object");
    }

    public void method4(BaseInterface temp){
        System.out.println("takes BaseInterface object");
    }
}
