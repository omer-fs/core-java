package com.oreilly.section4;

import java.util.ArrayList;

public class Wrapper {
    public static void main(String[] args) {
        ArrayList<Integer> myAl=new ArrayList<>();
        myAl.add(2);
        myAl.add(5);
        for(int i=0;i<myAl.size();i++)
        {
            System.out.println(myAl.get(i));
        }
        String someValue="450";
        int value=Integer.parseInt(someValue);
        System.out.println(value);

        String pi="3.14159";
        double myPi=Double.parseDouble(pi);
        System.out.println(myPi);
    }
}
