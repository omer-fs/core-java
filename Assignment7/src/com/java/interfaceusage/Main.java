package com.java.interfaceusage;

public class Main {
    public static void main(String[] args) {
        InterfaceInheritanceDemo obj = new InterfaceInheritanceDemo();

        Concrete concrete = new Concrete();
        obj.method1(concrete);
        obj.method2(concrete);
        obj.method3(concrete);
        obj.method4(concrete);
    }
}
