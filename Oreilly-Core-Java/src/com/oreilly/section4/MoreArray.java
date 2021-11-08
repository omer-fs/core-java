package com.oreilly.section4;

public class MoreArray {
    public static void main(String[] args) {
        int myArray[]=new int[10];
        for(int i=0;i<myArray.length;i++)
        {
            myArray[i]=i+1;
        }
        for(int num:myArray)
        {
            System.out.println(num);
        }
    }
}
