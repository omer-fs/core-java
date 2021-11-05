package com.java.assignment6;

public class ArrayObjectDemo {
    public static void main(String[] args) {
        // array of object references to ArrayObject class
        ArrayObject[] obj = new ArrayObject[2];

        // II-part solution
        obj[0] = new ArrayObject("Hello");
        obj[1] = new ArrayObject("World!");

        System.out.println(obj[0]);
    }
}
