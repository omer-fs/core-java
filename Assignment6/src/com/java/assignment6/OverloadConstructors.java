package com.java.assignment6;

public class OverloadConstructors {
    int n;
    OverloadConstructors()
    {
        this(10);
    }

    OverloadConstructors(int x)
    {
        this.n=x;
        System.out.println("Called from other constructor\nn = "+this.n);
    }

    /*
    public static void main(String ars[])
    {
        OverloadConstructors overloadConstructors = new OverloadConstructors();
    }
    */
}
