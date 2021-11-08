package com.oreilly.section6;

import java.util.ArrayList;

public class SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> someList=new ArrayList<>();
        someList.add(10);
        someList.add(20);
        someList.add(30);
        someList.add(40);
        someList.add(50);
        int sum=sumElements(someList);
        System.out.println("sum is "+sum);
    }
    public static int sumElements(ArrayList<Integer> list)
    {
        int sum=0;
        for(int num:list)
        {
            sum+=num;
        }
        return sum;
    }
}
