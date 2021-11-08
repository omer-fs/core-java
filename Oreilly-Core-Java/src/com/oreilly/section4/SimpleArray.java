package com.oreilly.section4;

public class SimpleArray {
    public static void main(String[] args) {
        int[] myArray;
        myArray=new int[5];
        myArray[0]=1;
        myArray[1]=12;
        myArray[2]=15;
        myArray[3]=17;
        myArray[4]=16;
//        for(int i=0;i<myArray.length;i++)
//        {
//            System.out.println(myArray[i]);
//        }
        for(int num:myArray)
        {
            System.out.println(num);
        }
    }
}
